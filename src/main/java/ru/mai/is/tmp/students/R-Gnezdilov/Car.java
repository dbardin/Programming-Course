/**
 * Created with IntelliJ IDEA.
 * User: SuPeRhEr0
 * Date: 11.11.13
 * Time: 11:30
 * To change this template use File | Settings | File Templates.
 */
abstract class Truck extends Car {
}
abstract class SportCars extends Car {
    void AccelerateTheCar(){
        System.out.println("Машина разогнана до 100км/ч за 4 секунды");
    }
}
class Man extends Truck implements Vehicle {
    @Override
    void CrashTest() {
        System.out.println("Crash-test пройден плохо");
    }
    void MaxCapacity(){
        System.out.println("Максимальная вместимость вашего грузовика - "+Capacity+" кг");
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
class Scania extends Truck  {
    @Override
    void CrashTest() {
        System.out.println("Crash-test пройден успешно, никто не пострадал");
    }
}
class Porshe extends SportCars implements Vehicle {
    @Override
    void CrashTest() {
        System.out.println("Crash-test пройден");
    }
    void AccelerateTheCar(){
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
class Ferrari extends SportCars {
    @Override
    void CrashTest() {
        System.out.println("Crash-test пройден почти отлично, разбито лобовое стекло");//To change body of implemented methods use File | Settings | File Templates.
    }
    void CheckTheRestOgGasoline(){
        System.out.println("Осталось полбака");
    }
}
class CarTestDrive {
     public static void main(String[] args){
        Car FerrariF1=new Ferrari();
        Car PorsheCayenne=new Porshe();
        Car ScaniaM200=new Scania();
        Car ManN1002=new Man();
        FerrariF1.CrashTest();
        PorsheCayenne.CrashTest();
        ScaniaM200.CrashTest();
        ManN1002.CrashTest();
        ManN1002.AccelerateTheCar();
        FerrariF1.AccelerateTheCar();
        ManN1002.Capacity=3000;
        Ferrari Ferrari2=new Ferrari();
        Porshe Porshe2=new Porshe();
        Man Man2=new Man();
        Ferrari2.CheckTheRestOgGasoline();
        Porshe2.NumberOfAirbags();
        Porshe2.TypeOfVehicle();
        Man2.TypeOfVehicle();
        Man2.NumberOfAirbags();
        Man2.Capacity=3000;
        Man2.MaxCapacity();
        PorsheCayenne.Speed=320;
        System.out.println("Максимальная скорость PorsheCayenne - "+PorsheCayenne.Speed+" км/ч");
     }

}
interface Vehicle {
    void NumberOfAirbags();
    void TypeOfVehicle();
}
abstract class Car {
    int Speed;
    int Capacity;
    void AccelerateTheCar(){
        System.out.println("Машина разогнана до 100км/ч за 20 секунд");
    }
    abstract void CrashTest();
}
