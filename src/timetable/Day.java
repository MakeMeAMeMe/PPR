package timetable;

public class Day {
    private String day_name;
    private String occupied_by;
    private Agenda agenda;

    public Day(){
        this.agenda = new Agenda();
    }

    public void dayTable(){

    }

    public String getDay_name() {
        return day_name;
    }

    public void setDay_name(String day_name) {
        this.day_name = day_name;
    }

    public String getOccupied_by() {
        return occupied_by;
    }

    public void setOccupied_by(String occupied_by) {
        this.occupied_by = occupied_by;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
}
