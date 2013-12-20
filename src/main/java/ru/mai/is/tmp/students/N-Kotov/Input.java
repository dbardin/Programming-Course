/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 11.11.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.N-Kotov;

import java.io.*;
public class Input {
    public String getUserInput(String prompt){
        String inputLine=null;
        System.out.print(prompt+" ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if (inputLine.length()==0) return null;
            } catch (IOException e) {
             System.out.println("IOException: "+e);
            }
         return inputLine;
    }
}