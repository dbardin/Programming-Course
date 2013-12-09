package ru.mai.is.tmp.students.e_teplinskala.Task02;
public class Sweet_cherry  extends Sweet_berries implements Berry{
    private int  Volume;
    public int getVolume(){
        return Volume;
    }
    public void setVolume (int Volume) {
        if (Volume<5) {
            this.Volume=Volume;
            System.out.println("Объем черешни"+getVolume());
        }
    }

    private String Color;
    public String getColor(){
        return Color;
    }
    public void setColor (String Color) {
        if (Color.contains("бордовый")) {
            this.Color=Color;}

        else this.Color=("бордовый");
        System.out.println("наша малина "+getColor());
    }
    private int Quantity_of_stones ;
    public int getQuantity_of_stones(){
        return Quantity_of_stones;
    }
    public void setQuantity_of_stones (int Quantity_of_stones) {
        if (Quantity_of_stones==1) {
            this.Quantity_of_stones=Quantity_of_stones;
            System.out.println("Количество косточек"+getQuantity_of_stones());
        }
    }
    public void Creation(){
        String Type = ("Черешня");
        System.out.println ("Тип выбранной ягоды: "+Type);

    }
}

