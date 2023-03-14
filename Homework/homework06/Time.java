public class Time {

    private int minute;
    private int second;

    public Time(int second) {
        this.second = second % 60;
        minute = second / 60;
    }

    @Override
    public String toString() {
        return minute + " minute " + second + " second";
    }
    
}
