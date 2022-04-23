package com.bol.team1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Coepoe Word Puzzle");
        System.out.println("====================");

        System.out.println("""
                \nRules:
                1. Create a word using given character, min 3 characters & max 6 characters.
                2. Each level, You have 10 chances to answer correctly.
                3. To get through to next level you have to score 70 points each level.
                """);

        System.out.println("Level 1");
        System.out.println("==========");
        System.out.println("\nd       e       t       t       l       i\n");

        String[] correctAnswer = {
                "die", "led", "lei", "let", "lid", "lie", "lit", "tie", "deli", "diet",
                "edit", "idle", "lied", "tide", "tied", "tilt", "tilde", "tiled", "title",
                "tilted", "titled",
        };
        String[] yourAnswer = new String[10];
        int totalCorrectAnswer = 0;

        for (int i = 0; i < yourAnswer.length; i++) {
            System.out.print(i + 1 + "> Your Answer : ");
            String answer = input.next();

            if (Arrays.asList(correctAnswer).contains(answer) && !Arrays.asList(yourAnswer).contains(answer)) {
                totalCorrectAnswer += 1;
                System.out.println("#Right. Score : " + totalCorrectAnswer * 10);
            }

            yourAnswer[i] = answer;
        }

        System.out.println("\nYou had answered " + yourAnswer.length + " times with " + totalCorrectAnswer + " right answers");
    }
}
