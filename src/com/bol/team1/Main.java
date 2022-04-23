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

        String[][] question = {{
                "d", "e", "t", "t", "l", "i",
        }, {
                "s", "e", "c", "a", "e", "n",
        }, {
                "h", "k", "r", "n", "e", "o",
        }};
        String[][] correctAnswer = {{
                "die", "led", "lei", "let", "lid", "lie", "lit", "tie", "deli", "diet",
                "edit", "idle", "lied", "tide", "tied", "tilt", "tilde", "tiled", "title",
                "tilted", "titled",
        }, {
                "sec", "can", "cane", "scan", "scene", "case", "cease"
        }, {
                "honk", "honker", "roe", "ore", "her", "hen", "one"
        }};
        String[][] yourAnswer = new String[question.length][10];

        int totalScore = 0;

        for (int level = 0; level < question.length; level++) {
            System.out.println("Level " + (level + 1));
            System.out.println("==========");
            Arrays.asList(question[level]).forEach(e -> System.out.print(e + "      "));
            System.out.println("\n");

            int totalCorrectAnswer = 0;
            for (int i = 0; i < yourAnswer[level].length; i++) {
                System.out.print(i + 1 + "> Your Answer : ");
                String answer = input.next();

                if (Arrays.asList(correctAnswer[level]).contains(answer) && !Arrays.asList(yourAnswer[level]).contains(answer)) {
                    totalCorrectAnswer += 1;
                    System.out.println("#Right. Score : " + totalCorrectAnswer * 10);
                }

                yourAnswer[level][i] = answer;
            }

            System.out.println("\nYou had answered " + yourAnswer.length + " times with " + totalCorrectAnswer + " right answers");
            totalScore += totalCorrectAnswer * 10;
        }

        System.out.println("Overall score: " + totalScore);
        System.out.println("You WIN!!");
    }
}
