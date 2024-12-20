package org.example;

public class MoodAnalysisException extends Exception {
    private final MoodError error;

    public MoodAnalysisException(MoodError error) {
        super(error.getMessage());
        this.error = error;
    }

    public MoodError getError() {
        return error;
    }
}
