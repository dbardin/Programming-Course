package ru.mai.is.tmp.students.e_teplinskala.Task02;
public class Grapes extends Sweet_berries implements Berry{
    private int  Volume;
    public int getVolume(){
        return Volume;
    }
    public void setVolume (int Volume) {
        if (Volume<6) {
            this.Volume=Volume;
            System.out.println("Объем винограда" +getVolume());
        }
    }

    private String Color;
    public String getColor(){
        return Color;
    }
    public void setColor (String Color) {
        if (Color.contains("светло-зелёный")) {
            this.Color=Color;}

        else this.Color=("светло-зелёный");
        System.out.println("наш виноград "+getColor());
    }

    private int Quantity_of_stones ;
    public int getQuantity_of_stones(){
        return Quantity_of_stones;
    }
    public void setQuantity_of_stones (int Quantity_of_stones) {
        if (Quantity_of_stones>1) {
            this.Quantity_of_stones=Quantity_of_stones;
            System.out.println("Количество косточек "+getQuantity_of_stones());
        }
    }
    public void Creation(){
        String Type = ("Виноград");
        System.out.println ("Тип выбранной ягоды: "+Type);

    }
}



