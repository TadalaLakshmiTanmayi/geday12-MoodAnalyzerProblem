package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerProblemTest {
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
    // Test case for TC2.1: Given null message, should return "HAPPY"
    @Test
    public void testAnalyseMood_NullMessage() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem(null);
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }
    // Test case for empty message, should return "HAPPY"
    @Test
    public void testAnalyseMood_EmptyMessage() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("");
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }

}