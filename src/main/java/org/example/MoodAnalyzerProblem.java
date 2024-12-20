package org.example;

import java.util.Scanner;

public class MoodAnalyzerProblem {
    private String message;
    public MoodAnalyzerProblem() {
        this.message = "";
    }
    public MoodAnalyzerProblem(String message) {
        this.message = message;
    }
    public String analyseMood() {
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
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem(message);
        System.out.println("Mood: " + moodAnalyser.analyseMood());

        sc.close();
    }
}