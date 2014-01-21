package main.java.ru.mai.is.tmp.students.example.data;

/**
 * @author dbardin
 */
public class LinearComplexity {

    public static int findMaxValue(int[] array){

        int maxValue=array[0];
        for(int index=1;index<array.length;index++){
           if(array[index]>maxValue)
               maxValue=array[index];
        }
        return maxValue;
    }

    public static int[] getRandomArray(int length){

        int rndArray[] = new int [length];
        for (int index = 0 ; index < length ; index++)
        {
            rndArray [index] = (int) (Math.random () * 100);
        }
        return rndArray;
    }

    public static void main(String[] args){
          System.out.println(findMaxValue(getRandomArray(35)));
    }

}
