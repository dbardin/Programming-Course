/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.12.13
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class Orange extends Apple {
    private String Color;
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color=Color;
        if(Color.equals("оранжевый")){
            this.Color=Color;
        } else this.Color="оранжевый";
    }

    public void eat(){
        System.out.println("Я съел этот апельсин");
    }
    public void cut(){
        System.out.println("Я почистил апельсин");
    }
}
