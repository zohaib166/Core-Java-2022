import java.io.Console;

public class Input3 {
    public static void main(String[] args) {
        Console c = System.console();
        char[] ch = c.readPassword();
        System.out.println(ch.toString());
    }
}
