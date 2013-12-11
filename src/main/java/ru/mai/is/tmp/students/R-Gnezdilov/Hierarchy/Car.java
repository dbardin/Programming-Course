package ru.mai.is.tmp.students.R-Gnezdilov.Hierarchy;

abstract class Car {
    protected int Speed;
    protected int Capacity;

    void AccelerateTheCar() {
        System.out.println("Машина разогнана до 100км/ч за 20 секунд");
    }

    abstract void CrashTest();
}
