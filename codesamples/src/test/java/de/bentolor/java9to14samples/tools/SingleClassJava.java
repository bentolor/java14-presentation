package de.bentolor.java9to14samples.tools;

/**
 * You can directly run this file via {@code java SingleClassJava.java}.
 */
public class SingleClassJava {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello executable .java source files!");
        } else {
            System.out.println("Hello "+args[0]+ '!');
        }
    }
}