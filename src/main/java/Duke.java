import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Duke {

    private String commandType;

    public static void main(String[] args) {
        System.out.println("");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        commandType = input;
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
