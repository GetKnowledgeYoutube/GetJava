package ru.getjava.core.homework;

import ru.getjava.core.interfaces.LessonRunner;

public class HomeWork1 implements LessonRunner {

    @Override
    public String getLessonName() {
        return "HomeWork1";
    }

    @Override
    public void runLesson(String[] args) {
        /*
         *
         * Write your own code here
         *
         * */
        System.out.println(getHomeWorkText());
    }

    public String getHomeWorkText() {
        /*
        *
        * Write your own code here
        *
        * */
        return "HomeWork run";
    }
}
