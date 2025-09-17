import com.utils.ConsoleInterface;
import com.utils.DataRepository;
import com.utils.DialogLogic;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        DataRepository dataRepository = new DataRepository();
        DialogLogic dialogLogic = new DialogLogic(dataRepository);
        ConsoleInterface consoleInterface = new ConsoleInterface(dialogLogic);

        consoleInterface.run();
    }
}