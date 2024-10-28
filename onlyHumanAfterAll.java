package Lesson2.Interfaces;

public class onlyHumanAfterAll {
    private static String name;
    private String currentTransport;
    private static boolean sitDown = false;

    public onlyHumanAfterAll(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public void sitPlease() {
        if (!sitDown) {
            System.out.println(name + " сел в(на) " + currentTransport);
            sitDown = true;
        } else {
            System.out.println(name + " встал с " + currentTransport);
            sitDown = false;
        }
    }

    public static boolean isSitDown() {
        return sitDown;
    }

    public static String getName() {
        return name;
    }

}
