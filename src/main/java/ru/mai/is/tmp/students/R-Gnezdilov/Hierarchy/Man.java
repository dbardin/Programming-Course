package ru.mai.is.tmp.students.R-Gnezdilov.Hierarchy;

class Man extends Truck implements Vehicle {
    @Override
    void CrashTest() {
        System.out.println("Crash-test пройден плохо");
    }

    void MaxCapacity() {
        System.out.println("Максимальная вместимость вашего грузовика - " + Capacity + " кг");
    }

    @Override
    public void TypeOfVehicle() {
        System.out.println("Наземное средство передвижения");
    }

    @Override
    public void NumberOfAirbags() {
        System.out.println("В машине 8 подушек безопасности");
    }
}