import java.io.*;

public class MainTester {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        switch (args[0]) {
        case "-h":
            help();
            break;
        case "-n":
            string(args[1]);
            break;
        case "-f":
            try {
                file(args[1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
        }
    }

    private static void help() {
        System.out.println(ANSI_YELLOW + "\nHi there!");
        System.out.println("Optional arguments and their uses:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "-h : Prints out this (help) message." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "-n : argument to add test object to the tester." + ANSI_RESET);
        System.out.println(ANSI_CYAN + "\tjava-cp bla.jar MainTester -n \"1,2,3,teststyle1,teststyle2\"" + ANSI_RESET);
        System.out
                .println(ANSI_GREEN + "-f : argument to add file containing test objects to the tester." + ANSI_RESET);
        System.out.println(ANSI_CYAN + "\tjava-cp bla.jar MainTester -f testobjectfile.txt\n" + ANSI_RESET);
    }

    private static void file(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String str = "";
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }

    private static void string(String string) {
        System.out.println(string);
    }
}