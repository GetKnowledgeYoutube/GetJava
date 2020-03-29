package ru.getjava.core.homework;

import ru.getjava.core.interfaces.LessonRunner;

import java.util.Properties;

public class HomeWork1 implements LessonRunner {

    public static final String USER_NAME = "user.name";

    @Override
    public String getLessonName() {
        return "HomeWork1";
    }

    @Override
    public void runLesson(String[] args) {
        /*
         *
         * Здесь вы можете тестировать свое решение
         *
         * */
        System.out.println(greeting("Denis"));

        Properties properties = System.getProperties();
        if (properties.containsKey(USER_NAME)) {
            System.out.println(greeting(properties.getProperty(USER_NAME)));
        }
    }

    public String greeting(String username) {
        /*
        *
        *  Напишите программу которая будет здороваться с пользователем по имени
        *
        *  Шаблон: "Hello, ${username}!"
        *
        * */
        return "";
    }
}
