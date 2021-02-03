package com.kodilla.collections.adv.immutable.homework;

public class Task {
    protected final String title;
    protected final String duration;

    public Task (String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return title;
    }

    public final String getDuration() {
        return duration;
    }
}
