package com.example.reminder;

import java.time.LocalDate;

public class LocalEvent {

    private String description;
    private LocalDate date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "At: " + this.getDate() + " " + this.getDescription();
    }
    public LocalEvent(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }
}
