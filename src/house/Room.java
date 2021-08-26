package house;

import timetable.Timetable;

public class Room {
    private int room_code;
    private float room_size;
    private Timetable timetable;

    public Room(){
        timetable = new Timetable();
    }

    public void getRoomAgenda() {

    }

    public int getRoom_code() {
        return room_code;
    }

    public void setRoom_code(int room_code) {
        this.room_code = room_code;
    }

    public float getRoom_size() {
        return room_size;
    }

    public void setRoom_size(float room_size) {
        this.room_size = room_size;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }
}
