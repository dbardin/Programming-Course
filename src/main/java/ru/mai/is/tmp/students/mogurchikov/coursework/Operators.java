package src.main.java.ru.mai.is.tmp.students.mogurchikov.coursework.Operators.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {

    public static void main(String[] args) throws IOException {
        String s = readFile("C:\\IncomprehensibleProgram.java");

        int d = s.length();

        int num = d - s.replaceAll("=", "$1$2").length();

        System.out.println("Нашел все операторы присваивания. Их было " + num + " штук");

    }

    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}



