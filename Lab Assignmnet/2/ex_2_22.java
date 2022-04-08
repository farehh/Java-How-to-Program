// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 4:09 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.22 What does the following code print?
 * System.out.print("*");
 * System.out.println("***");
 * System.out.println("*****");
 * System.out.print("****");
 * System.out.println("**");
 */

public class ex_2_22 {
    public static void main(String[] args) {
        System.out.print("*");
        System.out.println("***"); // Retunrs New Line
        System.out.println("*****"); // Retunrs New Line
        System.out.print("****");
        System.out.println("**"); // Retunrs New Line
    }
}