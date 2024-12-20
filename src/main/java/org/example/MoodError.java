package org.example;

public enum MoodError {
    NULL("Mood cannot be NULL"),
    EMPTY("Mood cannot be Empty");

    private final String message;

    MoodError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
