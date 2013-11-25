public class HuffmanLetters1 {
    int SchetchikFrequency;

    public int[] Frequency(char[] IsxodnayastrokaBezpovtoreniiSymbols, int dlinaisxodnoistroki) {
        SchetchikFrequency = 1; //Считаем частоту символов
        for (int i = 0; i < dlinaisxodnoistroki - 1; i++) {
            if (IsxodnayastrokaBezpovtoreniiSymbols[i] != IsxodnayastrokaBezpovtoreniiSymbols[i + 1]) {
                SchetchikFrequency++;
            }
        }
        int[] FrequncyOfSymbols = new int[SchetchikFrequency];
        for (int i = 0; i < SchetchikFrequency; i++) {
            FrequncyOfSymbols[i] = 1;
        }
        int j = 0;
        for (int i = 0; i < dlinaisxodnoistroki - 1; i++) {  //Записываем частоту в массив
            if (IsxodnayastrokaBezpovtoreniiSymbols[i] == IsxodnayastrokaBezpovtoreniiSymbols[i + 1]) {
                FrequncyOfSymbols[j] = FrequncyOfSymbols[j] + 1;
            } else {
                j++;
            }
        }
        return FrequncyOfSymbols;//Возвращаем частоту
    }

    public char[] DeleteTheSameLetters(char[] IsxodnayastrokaBezpovtoreniiSymbols, int dlinaisxodnoistroki) {
        char[] IsxodnayastrokaBezpovtoreniiSymbols2 = new char[SchetchikFrequency]; //Убираем символы, которые повторяются, оставляем всего лишь один дубликат
        IsxodnayastrokaBezpovtoreniiSymbols2[0] = IsxodnayastrokaBezpovtoreniiSymbols[0];
        int j = 1;
        for (int i = 0; i < dlinaisxodnoistroki - 1; i++) {
            if (IsxodnayastrokaBezpovtoreniiSymbols[i] != IsxodnayastrokaBezpovtoreniiSymbols[i + 1]) {
                IsxodnayastrokaBezpovtoreniiSymbols2[j] = IsxodnayastrokaBezpovtoreniiSymbols[i + 1];
                j++;
            }
        }
        return IsxodnayastrokaBezpovtoreniiSymbols2;
    }

    public int[] SortirovkaMassiva1(int[] FrequencyOfSymbols, char[] IsxodnayastrokaVmassive) {
        char tmp;
        int tmp1;
        for (int i = 0; i < FrequencyOfSymbols.length - 1; i++) {
            for (int j = i + 1; j < FrequencyOfSymbols.length; j++) {
                if (IsxodnayastrokaVmassive[i] > IsxodnayastrokaVmassive[j]) {
                    tmp = IsxodnayastrokaVmassive[i];
                    IsxodnayastrokaVmassive[i] = IsxodnayastrokaVmassive[j];
                    IsxodnayastrokaVmassive[j] = tmp;
                    tmp1 = FrequencyOfSymbols[i];
                    FrequencyOfSymbols[i] = FrequencyOfSymbols[j];
                    FrequencyOfSymbols[j] = tmp1;
                }
            }
        }
        return FrequencyOfSymbols;
    }

    public char[] SortirovkaMassiva2(int[] FrequencyOfSymbols, char[] IsxodnayastrokaVmassive) {
        char ZapominPeremennay;
        int ZapominPeremennay2;
        for (int i = 0; i < FrequencyOfSymbols.length - 1; i++) {
            for (int j = i + 1; j < FrequencyOfSymbols.length; j++) {
                if (IsxodnayastrokaVmassive[i] > IsxodnayastrokaVmassive[j]) {
                    ZapominPeremennay = IsxodnayastrokaVmassive[i];
                    IsxodnayastrokaVmassive[i] = IsxodnayastrokaVmassive[j];
                    IsxodnayastrokaVmassive[j] = ZapominPeremennay;
                    ZapominPeremennay2 = FrequencyOfSymbols[i];
                    FrequencyOfSymbols[i] = FrequencyOfSymbols[j];
                    FrequencyOfSymbols[j] = ZapominPeremennay2;
                }
            }
        }
        return IsxodnayastrokaVmassive;
    }

    public String[] IzmenyaemCharNaString(char[] IsxodnayastrokaBezpovtoreniiSymbols) {
        String[] IsxodnayaStrokaBezPovtorov = new String[IsxodnayastrokaBezpovtoreniiSymbols.length];
        for (int i = 0; i < IsxodnayastrokaBezpovtoreniiSymbols.length; i++) {
            IsxodnayaStrokaBezPovtorov[i] = "" + IsxodnayastrokaBezpovtoreniiSymbols[i];
        }
        return IsxodnayaStrokaBezPovtorov;
    }

    public String Decoding(String Isxodnayastroka, int[] FrequencyOfSymbols, String[] CodeOfSymbols, String[] IsxodnayastrokaBezpovtoreniiSymbols2) {
        StringBuffer DecodindStroka = new StringBuffer(Isxodnayastroka);
        String stroka;
        int MaxFrequency = 0; //Поиск максимальной частоты
        for (int i = 0; i < FrequencyOfSymbols.length; i++) {
            if (FrequencyOfSymbols[i] > MaxFrequency) {
                MaxFrequency = FrequencyOfSymbols[i];
            }
        }
        int[] IndexOfSymbols = new int[CodeOfSymbols.length];
        int DlinaStroki = CodeOfSymbols.length;
        for (int d = 0; d < MaxFrequency; d++) {
            int min = DecodindStroka.length();
            for (int i = 0; i < DlinaStroki; i++) {   //Декодируем строку заменой символов с конца
                IndexOfSymbols[i] = DecodindStroka.indexOf(CodeOfSymbols[i]);
            }
            for (int i = 0; i < DlinaStroki; i++) {
                if (IndexOfSymbols[i] < min && IndexOfSymbols[i] >= 0) {
                    min = IndexOfSymbols[i];
                }
            }
            for (int i = 0; i < DlinaStroki; i++) {
                if (IndexOfSymbols[i] == min) {
                    DecodindStroka = DecodindStroka.replace(IndexOfSymbols[i], IndexOfSymbols[i] + CodeOfSymbols[i].length(), IsxodnayastrokaBezpovtoreniiSymbols2[i]);
                }
            }
        }
        return stroka = DecodindStroka.toString();
    }
}