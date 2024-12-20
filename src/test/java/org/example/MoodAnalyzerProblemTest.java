package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerProblemTest {
    MoodAnalyzerProblem moodAnalyser=new MoodAnalyzerProblem();

    // Test case for TC1.1: Given "I am in Sad Mood" message, should return "SAD"
    @Test
    public void testAnalyseMood_Sad() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD", result);
    }

    // Test case for TC1.2: Given "I am in Happy Mood" message, should return "HAPPY"
    @Test
    public void testAnalyseMood_Happy() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Happy Mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }

}