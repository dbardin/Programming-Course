package ru.mai.is.tmp.students.R-Gnezdilov.Hierarchy;

class Porshe extends SportCars implements Vehicle {
    @Override
    void CrashTest() {
        System.out.println("Crash-test пройден");
    }

    void AccelerateTheCar() {
        System.out.println("Машина разогнана до 100км/ч за 3 секунды");
    }

    @Override
    public void TypeOfVehicle() {
        System.out.println("Наземное средство передвижения");
    }

    @Override
    public void NumberOfAirbags() {
        System.out.println("В машине 5 подушек безопасности");
    }
}