/**
 * Created by Владислав on 08.12.13.
 */
package ru.mai.is.tmp.students.V-Kulaev.Hierarchy;

class TestDriveRocket {
    public static void main(String[] args) {
        rocket butterfly320 = new butterflyrocket();
        tennisrocket babolat40 = new babolatrocket();
        rocket yonex210 = new yonexrocket();
        babolat40.speed = 95;
        butterfly320.speed = 170;
        babolat40.maxspeed();
        babolat40.typeofball();
        butterfly320.typeofball();
        butterfly320.maxspeed();
        yonex210.maxspeed();
        yonex210.typeofball();
        babolat40.whatmaterialisused();
    }
}
