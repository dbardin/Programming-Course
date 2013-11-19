/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integral;

/**
 *
 * @author Leo
 */
public class Integral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a=Float.parseFloat(args[0]);
        float b=Float.parseFloat(args[1]);
        float c=Float.parseFloat(args[2]);
        float x1=Float.parseFloat(args[3]);
        float x2=Float.parseFloat(args[4]);
        float n=Float.parseFloat(args[5]);
        float s=0, h=(x2-x1)/n;
        for (float i=x1; i<x2; i=i+h)
            s=s+(a*i*i+b*i+c)*h;
        System.out.println(s);
        // TODO code application logic here
    }
}
