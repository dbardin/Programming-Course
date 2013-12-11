package ru.mai.is.tmp.students.N-Kotov.Hierarchy;

abstract class Drugs {
    protected String dependence;

    abstract void SingsOfUse();

    void DependingOnTheStrength() {
        System.out.println("Наркотики : Зависимость - сильная");
    }
}
