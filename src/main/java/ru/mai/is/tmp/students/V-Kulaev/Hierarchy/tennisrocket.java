/**
 * Created by Владислав on 08.12.13.
 */
package ru.mai.is.tmp.students.V-Kulaev.Hierarchy;

abstract class tennisrocket extends rocket implements material {
    void maxspeed() {
        System.out.println("Максимальная скорость 100 км/ч");
    }

    public void whatmaterialisused() {
        System.out.println("Дерево");
    }

    void typeofball() {
        System.out.println("Тип шара - резиновый");
    }
}
