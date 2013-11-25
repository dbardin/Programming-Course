public class Huffman1 {
    public static void main(String[] args) {
        Huffmaninput1 Huffmaninput = new Huffmaninput1();
        HuffmanLetters1 HuffmanLetters = new HuffmanLetters1();
        HuffmanTree1 HuffmanTree = new HuffmanTree1();
        String Isxodnayastroka;
        int dlinaisxodnoistroki;
        char[] IsxodnayastrokaVmassive;
        char[] IsxodnayastrokaBezpovtoreniiSymbols;
        int[] FrequencyOfSymbols;
        int[] FrequencyOfSymbols2;
        String[] CodeOfSymbols;
        String[] IsxodnayastrokaBezpovtoreniiSymbols2;
        String zakodirovStroka = "";
        String StrokaDlyaProverkiCodingOrDecoding = Huffmaninput.VvodProverkiCodeOrDecode(); //Возвращаем значение того, что следует выполнить кодирование или декодирование
        if (StrokaDlyaProverkiCodingOrDecoding.equals("coding")) {
            Isxodnayastroka = Huffmaninput.VvodIsxodnoiStroki();//Возвращаем значение введеной строки
            dlinaisxodnoistroki = Isxodnayastroka.length();
            IsxodnayastrokaVmassive = new char[dlinaisxodnoistroki];
            Isxodnayastroka.getChars(0, dlinaisxodnoistroki, IsxodnayastrokaVmassive, 0);//Создаем массив char содержаший все символы исходной строки по порядку
            IsxodnayastrokaBezpovtoreniiSymbols = Huffmaninput.SortirovkaMassiva(dlinaisxodnoistroki, Isxodnayastroka);//Сортируем введеную строку и возвращаем ее значение
            FrequencyOfSymbols = HuffmanLetters.Frequency(IsxodnayastrokaBezpovtoreniiSymbols, dlinaisxodnoistroki);//Cоздаем массив, каждый член которого равен частоте соответствующего символа
            IsxodnayastrokaBezpovtoreniiSymbols = HuffmanLetters.DeleteTheSameLetters(IsxodnayastrokaBezpovtoreniiSymbols, dlinaisxodnoistroki);//Изменяем массив char, чтобы не было повторений символов
            FrequencyOfSymbols2 = new int[HuffmanLetters.SchetchikFrequency]; //Массив сохраняющий частоту
            for (int i = 0; i < HuffmanLetters.SchetchikFrequency; i++) {
                FrequencyOfSymbols2[i] = FrequencyOfSymbols[i];
            }
            CodeOfSymbols = HuffmanTree.Coding(FrequencyOfSymbols);//Создаем массив, содержащий код каждого символа
            for (int i = 0; i < HuffmanLetters.SchetchikFrequency; i++) {  //Выводим известные данные:символ частота код
                System.out.print("Символ - " + IsxodnayastrokaBezpovtoreniiSymbols[i] + "; его частота = " + FrequencyOfSymbols2[i] + "; его код - " + CodeOfSymbols[i]);
                System.out.println();
            }
            IsxodnayastrokaBezpovtoreniiSymbols = Huffmaninput.SortirovkaMassiva(dlinaisxodnoistroki, Isxodnayastroka);
            FrequencyOfSymbols = HuffmanLetters.Frequency(IsxodnayastrokaBezpovtoreniiSymbols, dlinaisxodnoistroki);
            IsxodnayastrokaBezpovtoreniiSymbols = HuffmanLetters.DeleteTheSameLetters(IsxodnayastrokaBezpovtoreniiSymbols, dlinaisxodnoistroki);
            zakodirovStroka = HuffmanTree.CodingWithStringOnExit(FrequencyOfSymbols, IsxodnayastrokaVmassive, IsxodnayastrokaBezpovtoreniiSymbols);
            System.out.println("Строка, которую вы ввели - " + Isxodnayastroka + "; Закодированная строка - " + zakodirovStroka);
        } else {
            while (true) {
                Isxodnayastroka = Huffmaninput.VvodStrokiDlyaDecode();//Возвращаем значение введеной строки из метода Input3
                boolean check = true;
                StrokaDlyaProverkiCodingOrDecoding = Huffmaninput.VvodSymbols();//Возвращаем символы которые были закодированы
                IsxodnayastrokaBezpovtoreniiSymbols = new char[StrokaDlyaProverkiCodingOrDecoding.length()];
                StrokaDlyaProverkiCodingOrDecoding.getChars(0, StrokaDlyaProverkiCodingOrDecoding.length(), IsxodnayastrokaBezpovtoreniiSymbols, 0); //Создаем массив символов из той строки
                FrequencyOfSymbols = new int[StrokaDlyaProverkiCodingOrDecoding.length()];
                FrequencyOfSymbols = Huffmaninput.VvodFrequencyOfSymbols(IsxodnayastrokaBezpovtoreniiSymbols); //Создаем массив частот
                IsxodnayastrokaVmassive = IsxodnayastrokaBezpovtoreniiSymbols;
                IsxodnayastrokaBezpovtoreniiSymbols = HuffmanLetters.SortirovkaMassiva2(FrequencyOfSymbols, IsxodnayastrokaVmassive); //Сортируем массив char, чтобы символы были в алф порядке
                IsxodnayastrokaBezpovtoreniiSymbols2 = HuffmanLetters.IzmenyaemCharNaString(IsxodnayastrokaBezpovtoreniiSymbols);//Из массива Char делаем массив String
                FrequencyOfSymbols = HuffmanLetters.SortirovkaMassiva1(FrequencyOfSymbols, IsxodnayastrokaVmassive);   //Сортируем массив int, чтобы частоты соответствовали отсортированным символам
                CodeOfSymbols = HuffmanTree.Coding(FrequencyOfSymbols); //Создаем массив, содержащий код каждого символа
                System.out.println();
                System.out.print("Строка, которую вы ввели - " + Isxodnayastroka + "; Декодированная строка - ");
                Isxodnayastroka = HuffmanLetters.Decoding(Isxodnayastroka, FrequencyOfSymbols, CodeOfSymbols, IsxodnayastrokaBezpovtoreniiSymbols2);
                for (int i = 0; i < Isxodnayastroka.length(); i++) {
                    check = true;
                    if (Isxodnayastroka.charAt(i) == '0' || Isxodnayastroka.charAt(i) == '1') {
                        check = false;
                    }
                }
                if (check) {
                    System.out.print(Isxodnayastroka);
                    break;
                } else {
                    System.out.println("Видимо вы ввели неверные исходные данные, попробуйте еще раз");
                }
            }
        }
    }
}

