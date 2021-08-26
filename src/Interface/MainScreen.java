package Interface;

import dados.Person;
import house.House;
import house.Room;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainScreen {
    private final List<House> houses;
    Scanner scanner = new Scanner(System.in);

    public MainScreen() {
        houses = new ArrayList<>();
    }

    public void seeTimeTables_bt() {

    }

    public void signUpNewHouse_bt() {
        House newHouse = new House();

        System.out.println("Digite o nome da casa: ");
        newHouse.setHouse_name(scanner.nextLine());

        System.out.println("Digite o código da casa: ");
        newHouse.setHouse_code(Integer.parseInt(scanner.nextLine()));

        int qtd_people, qtd_rooms;

        System.out.println("Digite a qtd de pessoas na casa: ");
        qtd_people = Integer.parseInt(scanner.nextLine());

        IntStream.range(0, qtd_people).forEach(i -> {
            System.out.println("Digite o nome da pessoa: ");
            Person person = new Person();
            person.setName(scanner.nextLine());
            newHouse.addPerson(person);
        });

        System.out.println("Digite a qtd de quartos na casa: ");
        qtd_rooms = Integer.parseInt(scanner.nextLine());

        IntStream.range(0, qtd_rooms).forEach(i -> {
            Room room = new Room();

            System.out.println("Digite a área do quarto: ");
            room.setRoom_size(Float.parseFloat(scanner.nextLine()));

            System.out.println("Digite o código do quarto: ");
            room.setRoom_code(Integer.parseInt(scanner.nextLine()));

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            while (true) {
                try {
                    System.out.println("Digite a data e hora que o quarto será limpo (dd/MM/aaaa HH:mm): ");
                    String dataStart = scanner.nextLine();
                    LocalDateTime dataInicio = LocalDateTime.parse(dataStart, dateTimeFormatter);
                    room.getTimetable().getDay().getAgenda().setStart_clean_time(dataInicio);
                    break;
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                    System.out.println("Data inválida, tente novamente");
                }
            }

            while (true) {
                try {
                    System.out.println("Digite a data e hora que o quarto terminará de ser limpo (dd/MM/aaaa HH:mm): ");
                    String dataEnd = scanner.nextLine();
                    LocalDateTime dataFim = LocalDateTime.parse(dataEnd, dateTimeFormatter);
                    room.getTimetable().getDay().getAgenda().setEnd_clean_time(dataFim);
                    break;
                } catch (Exception ex) {
                    System.out.println("Data inválida, tente novamente");
                }
            }

            newHouse.signUpNewHouse(room);
        });
        houses.add(newHouse);
    }

    public void readQrCode_bt() {

    }

    public void createQrCode_bt() {

    }

    public void mostrarTable() {
        for (House house :
                this.houses) {
            System.out.println(house.calculateTimeTable());
        }
    }

    public static void main(String[] args) {
        // Fazer tudo automático
        // Cadastrar uma casa?
        MainScreen mainScreen = new MainScreen();
        mainScreen.test();
        mainScreen.mostrarTable();
    }

    private void test() {
        House newHouse = new House();
        newHouse.setHouse_name("Casa 1");
        newHouse.setHouse_code(1);

        Person person = new Person();
        person.setName("Pessoa 1");
        newHouse.addPerson(person);

        Room room = new Room();
        room.setRoom_size(20);
        room.setRoom_code(1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String dataStart = "23/11/2021 06:31";
        String dataEnd = "23/11/2021 07:31";
        LocalDateTime dataInicio = LocalDateTime.parse(dataStart, dateTimeFormatter);
        LocalDateTime dataFim = LocalDateTime.parse(dataEnd, dateTimeFormatter);

        room.getTimetable().getDay().getAgenda().setStart_clean_time(dataInicio);
        room.getTimetable().getDay().getAgenda().setEnd_clean_time(dataFim);
        newHouse.signUpNewHouse(room);
        houses.add(newHouse);
    }
}
