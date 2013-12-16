package ru.mai.is.tmp.students.N-Kotov.Hierarhy;

abstract class Drugs implements Preparation {
    protected String dependence;

    abstract void SingsOfUse();

    void DependingOnTheStrength() {
        System.out.println("Наркотики : Зависимость - сильная");
    }
}
