package ru.mai.is.tmp.students.e_teplinskala.dom_rabota.Task02;
public  class Raspberry extends Berry_grade implements Berry {
private int  Volume;
public int getVolume(){
        return Volume;
    }
    public void setVolume (int Volume) {
        if (Volume>5) {
            this.Volume=Volume;
        }
        else this.Volume=5;
        System.out.println("Объем малины"+getVolume());
        }

    private int Quantity_of_stones ;
    public int getQuantity_of_stones(){
        return Quantity_of_stones;
    }
    public void setQuantity_of_stones (int Quantity_of_stones) {
        if (Quantity_of_stones==0) {
            this.Quantity_of_stones=Quantity_of_stones;
        }
        else this.Quantity_of_stones=0;
        System.out.println("Количество косточек "+getQuantity_of_stones());
    }
    public void Creation(){
        String Type = ("Малина");
        System.out.println ("Тип выбранной ягоды: "+Type);

    }
}