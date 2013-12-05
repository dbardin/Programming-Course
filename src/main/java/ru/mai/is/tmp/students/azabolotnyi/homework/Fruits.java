/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.12.13
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
abstract public class Fruits implements Food {
 public  void cut(){}
 private int Size;
    public int getSize(){
      return Size;
  }
    public void setSize(int Size){
        if(Size>5){
        this.Size=Size;
    } else this.Size=5;
}
}




