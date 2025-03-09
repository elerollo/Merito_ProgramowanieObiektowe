public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void addMinutes(int addedMinutes) {
        int totalMinutes = hour * 60 + minute + addedMinutes;
        hour = (totalMinutes / 60) % 24 ;
        minute = totalMinutes % 60;
    }

    public void displayTime() {
        System.out.println(String.format("%02d:%02d", hour, minute));
    }
}
