package org.example;

import java.util.Scanner;

public class MoodAnalyzerProblem {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a message to analyze your mood:");
        String message = sc.nextLine();
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem();
        System.out.println("Mood: " + moodAnalyser.analyseMood(message));

        sc.close();
    }
}