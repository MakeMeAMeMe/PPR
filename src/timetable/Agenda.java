package timetable;

import java.time.Duration;
import java.time.LocalDateTime;

public class Agenda {
    LocalDateTime start_clean_time;
    LocalDateTime end_clean_time;

    public Duration cleanTime() {
        return Duration.between(start_clean_time, end_clean_time);
    }

    public LocalDateTime getStart_clean_time() {
        return start_clean_time;
    }

    public void setStart_clean_time(LocalDateTime start_clean_time) {
        this.start_clean_time = start_clean_time;
    }

    public LocalDateTime getEnd_clean_time() {
        return end_clean_time;
    }

    public void setEnd_clean_time(LocalDateTime end_clean_time) {
        this.end_clean_time = end_clean_time;
    }
}
