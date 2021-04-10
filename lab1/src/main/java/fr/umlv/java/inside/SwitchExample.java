package lab1.src.main.java.fr.umlv.java.inside;

public class SwitchExample {
    public static int switchExample(String s) {
        return switch (s) {
            case "dog" -> 1;
            case "cat" -> 2;
            default -> 4;
        };
    }
}
