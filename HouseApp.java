package Command;

import java.util.ArrayList;
import java.util.List;

public class HouseApp extends HouseCommands {

    List<String> listCommands = new ArrayList<>();

    public void addCommand(String command) {
        this.listCommands.add(command);
    }

    public void executeCommand() {
        if (this.listCommands.isEmpty()) {
            System.out.print("There are no commands in the list!");

        } else {
            for (String i : this.listCommands) {
                System.out.println("Command added: " + i);
                this.execute();
            }
        }

    }

    public void undoCommand() {
        if (this.listCommands.isEmpty()) {
            System.out.print("There are no commands in the list!");

        } else {
            for (String i : listCommands) {
                System.out.println("Command added: " + i);
                this.undo();
            }
        }
    }
}
