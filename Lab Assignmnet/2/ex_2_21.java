// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 4:07 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.21 What does the following code print?
 * System.out.print("*");
 * System.out.print("***");
 * System.out.print("*****");
 * System.out.print("****");
 * System.out.println("**");
 */

public class ex_2_21 {
    public static void main(String[] args) {
        // print does not move cursor to next line
        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");   
    }
}