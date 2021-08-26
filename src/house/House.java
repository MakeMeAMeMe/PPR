package house;

import dados.Person;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String house_name;
    private int house_code;
    private int num_rooms;
    private int num_people;
    private List<Room> rooms; // ok
    private List<Person> people; // ok

    public House() {
        this.rooms = new ArrayList<>();
        this.people = new ArrayList<>();
    }

    public void signUpNewHouse(Room room) {
        this.rooms.add(room);
    }

    public String calculateTimeTable() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Room room :
                this.rooms) {
            stringBuilder.append(String.format("Data início: %s, Área: %s\n", room.getTimetable(), room.getRoom_size()));
        }
        return stringBuilder.toString();
    }

    public String getHouse_name() {
        return house_name;
    }

    public void setHouse_name(String house_name) {
        this.house_name = house_name;
    }

    public int getHouse_code() {
        return house_code;
    }

    public void setHouse_code(int house_code) {
        this.house_code = house_code;
    }

    public int getNum_rooms() {
        return num_rooms;
    }

    public void setNum_rooms(int num_rooms) {
        this.num_rooms = num_rooms;
    }

    public int getNum_people() {
        return num_people;
    }

    public void setNum_people(int num_people) {
        this.num_people = num_people;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }
}
