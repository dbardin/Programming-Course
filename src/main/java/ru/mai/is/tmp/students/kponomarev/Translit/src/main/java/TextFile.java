//package ru.mai.is.tmp.students.kponomarev.Translit.src.main.java;
import java.io.*;
import java.util.*;

public class TextFile extends ArrayList<String> {

    //static ru.mai.is.tmp.students.kponomarev.Translit.src.main.java.Transliterator Translit = new ru.mai.is.tmp.students.kponomarev.Translit.src.main.java.Transliterator();
    static Transliterator Translit = new Transliterator();

    //Чтение файла как одной строки
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader( new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    //Запись файла за один вызов метода
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(Translit.getTranslit(text));
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Чтение файла с разбиением по регулярному выражению
    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        //Вызов split часто оставляет пустой объект String в начальной позиции
        if (get(0).equals("")) remove(0);
    }

    //Обычное построчное чтение
    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                for(String item: this)
                    out.println(item);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //System.out.println("Введите путь к файлу: ");
        //Scanner scan = new Scanner(System.in);
        //String fileName = scan.nextLine();
        //String fileName = "C:/file.txt";
        String fileName = "TextFile.txt";
        String file = read(fileName);
        //String file = read("TextFile.txt");
        write("translited_" + fileName, file);
        TextFile text = new TextFile("translited_" + fileName);
        text.write("translited_" + fileName);
        System.out.println("Результат сохранен в файле " + "translited_" + fileName);
    }
}