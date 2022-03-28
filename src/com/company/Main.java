package com.company;
import java.util.*;


public class Main {

    static void Start() {
        String begin = "To start the game, type start. Or, h for help."; // Text when game is loaded.
        System.out.println(begin);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Start();
        String line;
        line = sc.nextLine();
        switch (line) {
            case "h":
            System.out.println("help text go brr");
            break;
            case "start":
                System.out.println("Starting Game... Please Wait..");
                break;

        }

    }


}
