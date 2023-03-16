package assignment2.travel;

public class DateAndTime {
    
    private int year, month, day, hour, minute;

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getHour() { return hour; }
    public int getMinute() { return minute; }

    public DateAndTime(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public DateAndTime() {
        this(2021, 12, 22, 04, 30);
    }

    public String getDateAndTime(){
        StringBuilder sb = new StringBuilder();
        sb.append(year);
        sb.append('.');
        sb.append(month);
        sb.append('.');
        sb.append(day);
        sb.append(" at ");
        sb.append(hour);
        sb.append(':');
        sb.append(minute);
        return sb.toString();
    }

    public String getTime(){
        return String.format("%d:%d", hour, minute);
    }
    
}
