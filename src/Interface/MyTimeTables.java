package Interface;

import timetable.Timetable;

public class MyTimeTables {
    private int view_mode_status;
    private Timetable timetable;
    public void switchViewMode(){

    }
    public void getTimeTable(){
        System.out.println(this.timetable.getDay().getAgenda().cleanTime()); // TODO
    }
    public void deleteTimeTable(){

    }
    public void changeTimeTable(){

    }
}
