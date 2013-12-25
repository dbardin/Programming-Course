package ru.mai.is.tmp.students.e_teplinskala.dom_rabota.Task02;
public  class Grapes extends Stones implements Berry{
    private int  Volume;
    public int getVolume(){
        return Volume;
    }
    public void setVolume (int Volume) {
        if (Volume==6) {
            this.Volume=Volume;
        }
        else this.Volume=6;
        System.out.println("Объем винограда" +getVolume());
    }

    private int Quantity_of_stones ;
    public int getQuantity_of_stones(){
        return Quantity_of_stones;
    }
    public void setQuantity_of_stones (int Quantity_of_stones) {
        if (Quantity_of_stones>1) {
            this.Quantity_of_stones=Quantity_of_stones;
           }
        else this.Quantity_of_stones=1;
        System.out.println("Косточки "+getExistence_of_stones()+" Количество косточек"+getQuantity_of_stones());
    }
    public void Creation(){
        String Type = ("Виноград");
        System.out.println ("Тип выбранной ягоды: "+Type);

    }
}



