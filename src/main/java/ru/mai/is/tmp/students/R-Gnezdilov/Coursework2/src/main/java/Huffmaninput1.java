import java.util.Arrays;

public class Huffmaninput1 {
    public String VvodIsxodnoiStroki() {
        Input input = new Input();//Создаем объект класса input для ввода данных с клавиатуры
        String Isxodnayastroka;
        while (true) { //Цикл на случай, если пользователь не ввел данные
            Isxodnayastroka = input.getUserInput("Введите то, что следует перекодировать");//Вводим данные с клавиатуры
            if (Isxodnayastroka == null) {
                System.out.println("Ошибка, вы ничего не ввели, попробуйте еще раз");
            } else {
                break;
            }//Если строка пустая, то цикл начинается сначала и просит снова ввести данные, если же строка не пустая то цикл прекращается
        }
        return Isxodnayastroka;
    }

    public char[] SortirovkaMassiva(int dlinaisxodnoistroki, String Isxodnayastroka) {
        char[] IsxodnayaStrokaVmassive = new char[dlinaisxodnoistroki];//Создаем массив char
        Isxodnayastroka.getChars(0, dlinaisxodnoistroki, IsxodnayaStrokaVmassive, 0);//Строку разбираем в массив char, посимвольно
        Arrays.sort(IsxodnayaStrokaVmassive);//Сортируем массив char
        return IsxodnayaStrokaVmassive;
    }

    public String VvodProverkiCodeOrDecode() {
        Input input = new Input();
        String Strokaproverki;//Создаем объект класса input для ввода данных с клавиатуры
        while (true) { //Цикл на случай, если пользователь не ввел данные
            Strokaproverki = input.getUserInput("Напишите coding, если вы хотите закодировать строку, или decoding, если вы хотите декодировать строку");//Вводим данные с клавиатуры
            if (Strokaproverki == null) {
                System.out.println("Ошибка, вы ввели не то, что следовало, попробуйте еще раз");
            } else if (!Strokaproverki.equals("coding") && !Strokaproverki.equals("decoding")) {
                System.out.println("Ошибка, вы ввели не то, что следовало, попробуйте еще раз");
            } else {
                break;
            }//Если строка не равна одному из заданных слов, то цикл начинается сначала и просит снова ввести данные, если же строка не пустая то цикл прекращается
        }
        return Strokaproverki;
    }

    public String VvodStrokiDlyaDecode() {
        Input input = new Input();
        char[] StrokaDlyaDecodeVmassive;
        boolean Check;
        String StrokaDlyaDecode;//Создаем объект класса input для ввода данных с клавиатуры
        while (true) { //Цикл на случай, если пользователь не ввел данные
            Check = true;
            StrokaDlyaDecode = input.getUserInput("Введите то, что следует декодировать");//Вводим данные с клавиатуры
            if (StrokaDlyaDecode == null) {
                System.out.println("Ошибка, вы ничего не ввели, попробуйте еще раз");
                Check = false;
            } else {//Обрабатываем введеные данные, проверяем соответствуют ли они условиям
                StrokaDlyaDecodeVmassive = new char[StrokaDlyaDecode.length()];
                StrokaDlyaDecode.getChars(0, StrokaDlyaDecode.length(), StrokaDlyaDecodeVmassive, 0);
                for (int i = 0; i < StrokaDlyaDecode.length(); i++) {
                    if (StrokaDlyaDecodeVmassive[i] != '1' && StrokaDlyaDecodeVmassive[i] != '0') {
                        Check = false;
                    }
                }
            }
            if (Check) {
                break;
            } else {
                System.out.println("Вы ввели строку неверного типа, попробуйте еще раз, она должна содержать только цифры 1 и 0");
            }
        }
        return StrokaDlyaDecode;
    }

    public String VvodSymbols() {
        Input input = new Input();
        boolean Check;
        String VvedennayaStroka;//Создаем объект класса input для ввода данных с клавиатуры
        while (true) { //Цикл на случай, если пользователь не ввел данные
            Check = true;
            VvedennayaStroka = input.getUserInput("Введите символы которые были использованы, цельной строкой без пробелов, только если он не использовался в качестве символа");//Вводим данные с клавиатуры
            if (VvedennayaStroka == null) {
                System.out.println("Ошибка, вы ничего не ввели, попробуйте еще раз");
            } else {          //Проверка на наличие повторяющихся символов
                for (int i = 0; i < VvedennayaStroka.length(); i++) {
                    for (int j = 0; j < VvedennayaStroka.length(); j++) {
                        if (VvedennayaStroka.charAt(i) == VvedennayaStroka.charAt(j) && i != j) {
                            Check = false;
                        }
                    }

                }
            }
            if (Check) {
                break;
            } else {
                System.out.println("Вы ввели строку, в которой есть повторяющиеся символы, а такого быть не должно, попробуйте еще раз");
            }
        }
        return VvedennayaStroka;
    }

    public int[] VvodFrequencyOfSymbols(char[] IsxodnayastrokaBezpovtoreniiSymbols) {
        Input input = new Input();
        boolean Check;
        String VvedennayaStroka;
        int[] FrequencyOfSymbols = new int[IsxodnayastrokaBezpovtoreniiSymbols.length];
        for (int i = 0; i < IsxodnayastrokaBezpovtoreniiSymbols.length; i++) {
            while (true) {
                Check = true;
                VvedennayaStroka = input.getUserInput("Введите частоту " + IsxodnayastrokaBezpovtoreniiSymbols[i] + " символа");
                try {
                    FrequencyOfSymbols[i] = Integer.parseInt(VvedennayaStroka);
                } catch (NumberFormatException e) {
                    Check = false;
                }
                if (Check) {
                    break;
                } else {
                    System.out.println("Вы ввели неправильное число, попробуйте еще раз");
                }
            }
        }
        return FrequencyOfSymbols;
    }
}

