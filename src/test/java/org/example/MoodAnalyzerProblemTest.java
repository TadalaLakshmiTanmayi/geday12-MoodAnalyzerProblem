package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerProblemTest {

    // Test case for TC3.1: Given null message, should throw MoodAnalysisException
    @Test
    public void testAnalyseMood_NullMessage() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem(null);
        try {
            moodAnalyser.analyseMood();
            fail("Expected MoodAnalysisException to be thrown");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodError.NULL, e.getError(), "Exception should indicate NULL mood error");
        }
    }

    // Test case for TC3.2: Given empty message, should throw MoodAnalysisException
    @Test
    public void testAnalyseMood_EmptyMessage() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("");
        try {
            moodAnalyser.analyseMood();
            fail("Expected MoodAnalysisException to be thrown");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodError.EMPTY, e.getError(), "Exception should indicate EMPTY mood error");
        }
    }

    // Test case for TC1.1: Given "I am in Sad Mood" message, should return "SAD"
    @Test
    public void testAnalyseMood_Sad() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Sad Mood");
        try {
            String result = moodAnalyser.analyseMood();
            assertEquals("SAD", result);
        } catch (MoodAnalysisException e) {
            fail("MoodAnalysisException should not be thrown for a valid mood");
        }
    }

    // Test case for TC1.2: Given "I am in Happy Mood" message, should return "HAPPY"
    @Test
    public void testAnalyseMood_Happy() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in any Mood");
        try {
            String result = moodAnalyser.analyseMood();
            assertEquals("HAPPY", result);
        } catch (MoodAnalysisException e) {
            fail("MoodAnalysisException should not be thrown for a valid mood");
        }
    }
}
