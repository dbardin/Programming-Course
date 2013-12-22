//package ru.mai.is.tmp.students.kponomarev.Translit.src.main.java;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class Transliterator {

    public String getTranslit(String primer) {
        return transliterate(primer);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в программу транслитерациии!\n");
        int select = 0;
        while (!(select == 1 || select == 2 || select == 3)) {
        System.out.println("Если Вы хотите транслитерировать файл, введите 1");
        System.out.println("Для ввода текста с клавиатуры, введите 2");
        System.out.println("Для выхода из программы, введите 3");
        System.out.print("Ввод: ");
        select = scan.nextInt();
        }

        switch (select) {
            case 1:
                TextFile.main(args);
                break;
            case 2:
                System.out.println("Введите Ваш текст: ");
                Scanner ssc = new Scanner(System.in);
                String s = ssc.nextLine();
                System.out.println("Транслитерированный текст: " + transliterate(s));
                break;
            case 3:
                break;
        }
    }

    private static final HashMap<Character, String> charMap = new HashMap<Character, String>();

    static {
        charMap.put('А', "A");
        charMap.put('Б', "B");
        charMap.put('В', "V");
        charMap.put('Г', "G");
        charMap.put('Д', "D");
        charMap.put('Е', "E");
        charMap.put('Ё', "Yo");
        charMap.put('Ж', "Zh");
        charMap.put('З', "Z");
        charMap.put('И', "I");
        charMap.put('Й', "I");
        charMap.put('К', "K");
        charMap.put('Л', "L");
        charMap.put('М', "M");
        charMap.put('Н', "N");
        charMap.put('О', "O");
        charMap.put('П', "P");
        charMap.put('Р', "R");
        charMap.put('С', "S");
        charMap.put('Т', "T");
        charMap.put('У', "U");
        charMap.put('Ф', "F");
        charMap.put('Х', "H");
        charMap.put('Ц', "Ts");
        charMap.put('Ч', "Ch");
        charMap.put('Ш', "Sh");
        charMap.put('Щ', "Shch");
        charMap.put('Ъ', "#");
        charMap.put('Ы', "Y");
        charMap.put('Ь', "'");
        charMap.put('Э', "E");
        charMap.put('Ю', "Yu");
        charMap.put('Я', "Ya");
        charMap.put('а', "a");
        charMap.put('б', "b");
        charMap.put('в', "v");
        charMap.put('г', "g");
        charMap.put('д', "d");
        charMap.put('е', "e");
        charMap.put('ё', "yo");
        charMap.put('ж', "zh");
        charMap.put('з', "z");
        charMap.put('и', "i");
        charMap.put('й', "i");
        charMap.put('к', "k");
        charMap.put('л', "l");
        charMap.put('м', "m");
        charMap.put('н', "n");
        charMap.put('о', "o");
        charMap.put('п', "p");
        charMap.put('р', "r");
        charMap.put('с', "s");
        charMap.put('т', "t");
        charMap.put('у', "u");
        charMap.put('ф', "f");
        charMap.put('х', "h");
        charMap.put('ц', "ts");
        charMap.put('ч', "ch");
        charMap.put('ш', "sh");
        charMap.put('щ', "shch");
        charMap.put('ъ', "#");
        charMap.put('ы', "y");
        charMap.put('ь', "'");
        charMap.put('э', "e");
        charMap.put('ю', "yu");
        charMap.put('я', "ya");
    }

    private static String transliterate(String string) {
        StringBuilder transliteratedString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            Character ch = string.charAt(i);
            String charFromMap = charMap.get(ch);
            if (charFromMap == null) {
                transliteratedString.append(ch);
            } else {
                transliteratedString.append(charFromMap);
            }
        }
        return transliteratedString.toString();
    }
}
