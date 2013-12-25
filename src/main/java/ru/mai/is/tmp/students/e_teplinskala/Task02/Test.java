package ru.mai.is.tmp.students.e_teplinskala.dom_rabota.Task02;
public  class Test {
    public static void main(String[] args){
        System.out.println("Выбираем ягоду");
        System.out.println("1. Малина:");
        Raspberry  jagoda_1 = new Raspberry ();
        jagoda_1.setVolume( 6);
        jagoda_1.setQuantity_of_stones( 0);
        jagoda_1.Creation();
        System.out.println("2. Черешня:");
        Sweet_cherry jagoda_2 = new Sweet_cherry();
        jagoda_2.setVolume( 5);
        jagoda_2.setExistence_of_stones("НЕТ");
        jagoda_2.setQuantity_of_stones( 1);
        jagoda_2.Creation();
        System.out.println("3. Виноград:");
        Grapes jagoda_3 = new Grapes();
        jagoda_3.setVolume( 15);
        jagoda_3.setExistence_of_stones("НЕТ");
        jagoda_3.setQuantity_of_stones( 0);
        jagoda_3.Creation();
}
}