package Command;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        HouseLight room = new HouseLight();
        room.nameRoom("Bedroom");

        //HouseCommands commands = new HouseCommands();
        //commands.addlightIntensity();

        HouseApp app = new HouseApp();
        app.addCommand("btn-1");
        app.undoCommand();

    }
}
