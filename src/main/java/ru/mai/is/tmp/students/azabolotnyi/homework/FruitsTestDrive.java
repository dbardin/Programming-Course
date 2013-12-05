/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.12.13
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class FruitsTestDrive {
    public static void main(String[] args){
      Orange Or1=new Orange();
         Or1.setSize(9);
         Or1.setColor("фиолетовый");
         System.out.println("Я смотрю на апельсин размером "+Or1.getSize()+" ,который "+Or1.getColor()) ;
          Or1.cut();
          Or1.eat();
         Apple A1=new Apple();
         A1.cut();
         A1.eat();

        }

    }

