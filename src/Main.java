import com.utils.Bot;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Bot bot = new Bot("Michael");
        String message;
        do {
            message = bot.answer(bot.getRequest());
            System.out.println(message);
        }
        while (!Objects.equals(message, "quit"));
    }
}