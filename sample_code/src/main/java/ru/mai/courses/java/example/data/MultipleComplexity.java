package main.java.ru.mai.is.tmp.students.example.data;

/**
 * @author dbardin
 */
public class MultipleComplexity {
    public static void slow(int upperBoundary){
        for(int indexOuter=0;indexOuter<upperBoundary;indexOuter++){
            for(int indexInner=0;indexInner<upperBoundary;indexInner++){
                for(int index=0;index<upperBoundary;index++){

                }
            }
        }
    }
    public static void fast(int upperBoundary){
        for(int indexOuter=0;indexOuter<upperBoundary;indexOuter++){
            for(int indexInner=0;indexInner<upperBoundary;indexInner++){
                slow(upperBoundary);
            }
        }
    }

    public static void main(String[] args){
        fast(100);
    }
}
