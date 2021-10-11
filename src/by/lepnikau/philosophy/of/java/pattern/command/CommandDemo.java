package by.lepnikau.philosophy.of.java.pattern.command;

public class CommandDemo {
    public static void main(String[] args) {

        Light light = new Light();

        LightTurnOnCommand turnOnCommand = new LightTurnOnCommand(light);
        LightTurnOffCommand turnOffCommand = new LightTurnOffCommand(light);

        Switch aSwitch = new Switch(turnOnCommand, turnOffCommand);

        aSwitch.flipUp();
        aSwitch.flipDown();

    }
}
