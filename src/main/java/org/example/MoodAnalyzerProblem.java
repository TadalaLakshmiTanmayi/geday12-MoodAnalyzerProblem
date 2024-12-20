package org.example;

import java.util.Scanner;

public class MoodAnalyzerProblem {
    private String message;
    public MoodAnalyzerProblem() {}

    public MoodAnalyzerProblem(String message) {
        this.message = message;
    }


    public String analyseMood() throws MoodAnalysisException {
        if (message == null) {
            throw new MoodAnalysisException(MoodError.NULL);
        } else if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodError.EMPTY);
        }
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
        try {
            System.out.println("Mood: " + moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
