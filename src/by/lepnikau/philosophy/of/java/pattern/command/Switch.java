package by.lepnikau.philosophy.of.java.pattern.command;

public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    void flipUp() {
        flipUpCommand.execute();
    }

    void flipDown() {
        flipDownCommand.execute();
    }
}
