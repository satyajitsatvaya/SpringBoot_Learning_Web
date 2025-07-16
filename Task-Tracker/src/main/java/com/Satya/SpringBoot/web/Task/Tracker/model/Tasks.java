package com.Satya.SpringBoot.web.Task.Tracker.model;

import org.springframework.stereotype.Component;

@Component
public class Tasks {

    private int  id;
    private  String title;

    private boolean completed;

    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
