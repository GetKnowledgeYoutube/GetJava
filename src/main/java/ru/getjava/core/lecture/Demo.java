package ru.getjava.core.lecture;

import ru.getjava.core.interfaces.LessonRunner;

public class Demo implements LessonRunner {

    @Override
    public String getLessonName() {
        return "Demo";
    }

    @Override
    public void runLesson(String[] args) {
        System.out.println("Hello, " + "Denis");
    }
}
