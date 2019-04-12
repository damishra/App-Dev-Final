import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.*;
import java.util.List;

public class MainTester {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        try {
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
        } catch (Exception e) {
             string("all,1|testname");
        }

    }

    private static void help() {
        System.out.println(ANSI_YELLOW + "\nHi there!");
        System.out.println("Optional arguments and their uses:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "-h : Prints out this (help) message." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "-n : argument to add test object to the tester." + ANSI_RESET);
        System.out.println(ANSI_CYAN + "\tjava -cp bla.jar MainTester -n \"table, 1|testname\"" + ANSI_RESET);
        System.out
                .println(ANSI_GREEN + "-f : argument to add file containing test objects to the tester." + ANSI_RESET);
        System.out.println(ANSI_CYAN + "\tjava -cp bla.jar MainTester -f testobjectfile.txt\n" + ANSI_RESET);
    }

    private static void file(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String str;
        while ((str = br.readLine()) != null) {
            String[] strArr = str.split(",",2);
            runTests(strArr);
        }
    }

    private static void string(String string) {
        String[] strArr = string.split(",");
        runTests(strArr);
    }

    private static void runTests(String[] strArr) {
        JUnitCore juc = new JUnitCore();
        switch (strArr[0]) {
            case "table":
                EdgeTableTest ett = new EdgeTableTest();
                ett.prepare(strArr[1]);
                Result res = juc.run(ett.getClass());
                int total = res.getRunCount();
                int fail = res.getFailureCount();
                List<Failure> fails = res.getFailures();
                System.out.println("Total tests run: " + ANSI_CYAN + total + ANSI_RESET);
                System.out.println("Total tests passed: " + ANSI_GREEN + (total-fail) + ANSI_RESET);
                System.out.println("Total tests failed: " + ANSI_RED + fail + ANSI_RESET);
                if (fail <= 0)
                    System.out.println(ANSI_GREEN + "All tests passed!" + ANSI_RESET);
                else
                    for (Failure f : fails) {
                        System.out.println(ANSI_RED + f.getTestHeader() + " : " + f.getDescription().getTestClass() + ANSI_RESET);
                    }
                break;
            case "field":
                EdgeFieldTest etf = new EdgeFieldTest();
                etf.prepare(strArr[1]);
                res = juc.run(etf.getClass());
                total = res.getRunCount();
                fail = res.getFailureCount();
                fails = res.getFailures();
                System.out.println("Total tests run: " + ANSI_CYAN + total + ANSI_RESET);
                System.out.println("Total tests passed: " + ANSI_GREEN + (total-fail) + ANSI_RESET);
                System.out.println("Total tests failed: " + ANSI_RED + fail + ANSI_RESET);
                if (fail <= 0)
                    System.out.println(ANSI_GREEN + "All tests passed!" + ANSI_RESET);
                else
                    for (Failure f : fails) {
                        System.out.println(ANSI_RED + f.getTestHeader() + " : " + f.getDescription().getTestClass() + ANSI_RESET);
                    }
                break;
            default:
                System.out.println(ANSI_YELLOW + "\nTesting EdgeField:" + ANSI_RESET);
                etf = new EdgeFieldTest();
                etf.prepare(strArr[1]);
                res = juc.run(etf.getClass());
                total = res.getRunCount();
                fail = res.getFailureCount();
                fails = res.getFailures();
                System.out.println("Total tests run: " + ANSI_CYAN + total + ANSI_RESET);
                System.out.println("Total tests passed: " + ANSI_GREEN + (total-fail) + ANSI_RESET);
                System.out.println("Total tests failed: " + ANSI_RED + fail + ANSI_RESET);
                if (fail <= 0)
                    System.out.println(ANSI_GREEN + "All tests passed!" + ANSI_RESET);
                else
                    for (Failure f : fails) {
                        System.out.println(ANSI_RED + f.getTestHeader() + " : " + f.getDescription().getTestClass() + ANSI_RESET);
                    }
                System.out.println(ANSI_YELLOW + "\nTesting EdgeTable:" + ANSI_RESET);
                ett = new EdgeTableTest();
                ett.prepare(strArr[1]);
                res = juc.run(ett.getClass());
                total = res.getRunCount();
                fail = res.getFailureCount();
                fails = res.getFailures();
                System.out.println("Total tests run: " + ANSI_CYAN + total + ANSI_RESET);
                System.out.println("Total tests passed: " + ANSI_GREEN + (total-fail) + ANSI_RESET);
                System.out.println("Total tests failed: " + ANSI_RED + fail + ANSI_RESET);
                if (fail <= 0)
                    System.out.println(ANSI_GREEN + "All tests passed!" + ANSI_RESET);
                else
                    for (Failure f : fails) {
                        System.out.println(ANSI_RED + f.getTestHeader() + " : " + f.getDescription().getTestClass() + ANSI_RESET);
                    }
                break;
        }
    }
}