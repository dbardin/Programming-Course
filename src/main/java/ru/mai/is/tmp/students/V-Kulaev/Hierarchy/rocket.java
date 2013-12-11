/**
 * Created by Владислав on 08.12.13.
 */
package ru.mai.is.tmp.students.V-Kulaev.Hierarchy;

abstract class rocket {
    protected int speed;

    void maxspeed() {
        System.out.println("Максимальная скорость 150 км/ч");
    }

    abstract void typeofball();
}
