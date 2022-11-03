
public class Lamp
{
    String name;
    boolean isOn;
    
    void turnOn() {
        isOn = true;
    }
    
    void turnOff() {
        isOn = false;
    }
    
    void displayLampStatus() {
        System.out.print("The lamp is turned on: ");
        System.out.print(isOn);
        System.out.println("");
    }
}
