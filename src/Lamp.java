public class Lamp {
    private boolean isOn;

    public Lamp() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        if (isOn == true) {
            return "The lamp is on";
        } else {
            return "The lamp is off";
        }
    }
}
