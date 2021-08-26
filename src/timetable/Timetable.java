package timetable;

public class Timetable {
    private int day_status;
    private Day day;

    public Timetable(){
        this.day = new Day();
    }

    public int getDay_status() {
        return day_status;
    }

    public void setDay_status(int day_status) {
        this.day_status = day_status;
    }

    public void createWeekTable(){

    }

    public Day getDay() {
        return day;
    }

    @Override
    public String toString(){
        return String.format("%s", this.day.getAgenda().start_clean_time.toString());
    }
}
