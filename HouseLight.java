package Command;

public class HouseLight {
    private boolean isOn = false;
    private String houseLocation;

    //public void addlightIntensity() {
    //    for (int i = 0; i <= 100; i += 20) {
    //        System.out.println("Intensity: " + i + "%");
    //        if (i == 100) {
    //            this.lightOn();
    //        }
    //    }
    //}

    //public void removelightIntensity() {
    //    for (int i = 100; i >= 0; i -= 20) {
    //        System.out.println("Intensity: " + i + "%");
    //        if (i == 0) {
    //            this.lightOff();
    //        }
    //    }
    //}

    public void nameRoom(String name) {
        this.houseLocation = name;
        System.out.println("House location: " + name);
    }

    public void powerStatus() {
        if (this.isOn == false) {
            System.out.println("Light is Off!");
        } else {
            System.out.println("Ligth is On!");
        }
    }

    public void lightOn() {
        this.isOn = true;
        this.powerStatus();
    }

    public void lightOff() {
        this.isOn = false;
        this.powerStatus();
    }
}
