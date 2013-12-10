/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.12.13
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.azabolotnyi.homework;
abstract public class Fruits implements Food   {

 private int Size;
    public int getSize(){
      return Size;
  }
    public void setSize(int Size){
        if(Size>10){
        this.Size=Size;
    } else this.Size=10;
}



}




