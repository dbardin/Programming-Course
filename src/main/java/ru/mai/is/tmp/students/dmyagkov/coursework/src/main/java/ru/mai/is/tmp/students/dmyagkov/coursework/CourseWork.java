package ru.mai.is.tmp.students.dmyagkov.coursework;
/*
 *Сoursework
 *
 *Программа для заучивания слов иностранного языка
 *
 *24.12.13
 *
 *@author Мягков Дмитрий
 */

import java.io.IOException;

public class CourseWork {

    public static void main(String[] args) throws IOException {
        Education educ = new Education();
        educ.setSelector(true);
        int a = educ.go();
    }
}
