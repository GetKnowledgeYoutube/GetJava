package ru.getjava.core;

import ru.getjava.core.homework.HomeWork1;
import ru.getjava.core.interfaces.LessonRunner;
import ru.getjava.core.lecture.Demo;

import java.util.List;

public class Main {

    private final static List<LessonRunner> lessonRunners;

    static {
        lessonRunners = List.of(
                new Demo(),
                new HomeWork1()
        );
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            lessonRunners.get(0).runLesson(args);
        } else {
            lessonRunners
                    .stream()
                    .filter(r -> args[0].equals(r.getLessonName()))
                    .findFirst()
                    .orElse(lessonRunners.get(0))
                    .runLesson(args);
        }
    }
}
