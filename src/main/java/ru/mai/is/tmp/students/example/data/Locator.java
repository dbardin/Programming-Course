package main.java.ru.mai.is.tmp.students.example.data;

/**
 * @author dbardin
 */
public class Locator {
    /**
     * -1 not found
     */
    public static int locate(int number,int[] array){
        boolean isFound=false;
        int index=0;
        while(!isFound&&index<array.length){
               if(array[index]==number){
                   isFound=true;
               }
               else
                   index++;
        }
        if(!isFound)
           index=-1;
        return index;
    }

    public static void main(String[] args){
        int[] array=new int[]{1,6,7,9,10,35,93};
        System.out.println(locate(9,array));
    }
}
