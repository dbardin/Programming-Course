package ru.mai.is.tmp.students.dmyagkov.coursework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author DIMA
 */
public class Education {

    private int counttrue;
    private boolean selector = false;
    private String slovo;
    private String russiantest;
    private String english; //Задание переменной        
    private String russian; //Задание переменной

    public void setSelector(boolean b) {
        selector = b;
    }

    //public String getTestResult(){
    //    return testResult;  
    //}
    public Scanner openFile(String path) throws FileNotFoundException {
        File t = new File(path);
        Scanner scn = new Scanner(t, "UTF-8");
        return scn;
    }

    public int go() throws IOException {

        //IOException - Если ошибка ввода-вывода происходит
        // File t = new File("src\\main\\resources\\Otveti.txt"); //Задание пути к файлу
        // Scanner scn = new Scanner(t, "UTF-8");
        Scanner pir = openFile("src\\main\\resources\\Otveti.txt");
        Scanner pirTest = openFile("src\\main\\resources\\testOtveti.txt");
        //File f = new File("src\\main\\resources\\Slova.txt");
        //BufferedReader fin = new BufferedReader(new FileReader(f));
        Scanner fin = openFile("src\\main\\resources\\Slova.txt");

        while (fin.hasNextLine()) {//Цикл прервется, когда будет конец файла
            english = fin.nextLine();
            russian = pir.nextLine();
            System.out.print(english + " - ");
            russiantest = pirTest.nextLine();

            if (selector) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                slovo = br.readLine();
            } else {
                slovo = russiantest;
                System.out.println(slovo);
            }
            // System.out.println(slovo);
            if (slovo.equalsIgnoreCase(russian)) {
                //если совпадает
                System.out.println("Ответ верный");
                counttrue++;
            } else { //Если не совпадает
                System.out.println("Ответ неверный" + " правильно:" + russian);
            }
        }
        System.out.println("Верных ответов:" + counttrue);
        fin.close();
        pir.close();
        pirTest.close();
        return counttrue;
    }
}
