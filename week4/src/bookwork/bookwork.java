package bookwork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        newLine();
        System.out.println("Cruel");
        threeLines();
        System.out.println("World");

        print("Hello World");
        printN("Hello", 3);

        int hour = 9;
        int minute = 28;
        printTime(hour, minute);

        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);
        newLine();
        System.out.println(root + " " + height);
        System.out.println(Math.toDegrees(Math.PI));

        String name = "Robert";
        String starName = starFiller(name);
        print(starName);   // ✅ added semicolon
    }

    private static String starFiller(String name) {
        String ret = "";
        for (int i = 0; i < name.length(); i++) {  // ✅ removed stray semicolon
            ret += "*" + name.charAt(i);
        }
        ret += "*";
        return ret;
    }

    private static void newLine() {
        System.out.println();
    }

    private static void threeLines() {
        newLine();
        newLine();
        newLine();
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void printN(String s, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }

    private static void printTime(int h, int m) {
        System.out.print(h);
        System.out.print(":");
        System.out.println(m);
    }
}
