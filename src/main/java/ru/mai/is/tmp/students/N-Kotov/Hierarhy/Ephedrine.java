package ru.mai.is.tmp.students.N-Kotov.Hierarchy;

public class Ephedrine extends Amphetamines implements Preparation {
    @Override
    public void Treatment() {
        System.out.println("Эфедрин : Используется для повышения давления, при бронхиальной астме, коклюше, крапивнице, при отравлении снотворными и некоторыми наркотиками, вызывающими расширение кровеносных сосудов");
    }
}
