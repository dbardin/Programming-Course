package ru.mai.is.tmp.students.R-Gnezdilov.Hierarchy;

class CarTestDrive {
    public static void main(String[] args) {
        Car FerrariF1 = new Ferrari();
        Car PorsheCayenne = new Porshe();
        Car ScaniaM200 = new Scania();
        Car ManN1002 = new Man();
        FerrariF1.CrashTest();
        PorsheCayenne.CrashTest();
        ScaniaM200.CrashTest();
        ManN1002.CrashTest();
        ManN1002.AccelerateTheCar();
        FerrariF1.AccelerateTheCar();
        ManN1002.Capacity = 3000;
        Ferrari Ferrari2 = new Ferrari();
        Porshe Porshe2 = new Porshe();
        Man Man2 = new Man();
        Ferrari2.CheckTheRestOgGasoline();
        Porshe2.NumberOfAirbags();
        Porshe2.TypeOfVehicle();
        Man2.TypeOfVehicle();
        Man2.NumberOfAirbags();
        Man2.Capacity = 3000;
        Man2.MaxCapacity();
        PorsheCayenne.Speed = 320;
        System.out.println("Максимальная скорость PorsheCayenne - " + PorsheCayenne.Speed + " км/ч");
    }

}