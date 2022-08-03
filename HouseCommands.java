package Command;

public class HouseCommands extends HouseLight implements Commands {

    @Override
    public void execute() {
        this.lightOn();
    }

    @Override
    public void undo() {
        this.lightOff();
    }

}
