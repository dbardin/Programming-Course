package ru.mai.is.tmp.students.R-Gnezdilov.Coursework2.src.main.java;

public class HuffmanTree1 {
    public String[] Coding(int[] FrequencyOfSymbols) {
        String[] DecodingStroka = new String[FrequencyOfSymbols.length];
        for (int i = 0; i < DecodingStroka.length; i++) {
            DecodingStroka[i] = "";
        }
        int[] IspolzovannieVetvi = new int[FrequencyOfSymbols.length];//Создаем массив, который будет следить за тем, какие ветви уже использованы
        int Maximum = 0;
        int[] IspolzovannieVetvi2 = new int[FrequencyOfSymbols.length];//Массив следящий за тем какие ветви использованы в данный момент
        int[] VetvSBolsheiFrequncy = new int[FrequencyOfSymbols.length];//Массив следящий за тем какое число больше
        for (int i = 0; i < FrequencyOfSymbols.length; i++) { //  Поиск наибольшего числа
            Maximum = FrequencyOfSymbols[i] + Maximum;
        }
        int Minimum1;
        int SchetchikVetvei = 1;
        while (true) {
            Minimum1 = Maximum;
            for (int i = 0; i < FrequencyOfSymbols.length; i++) {
                for (int j = 0; j < FrequencyOfSymbols.length; j++) {
                    if (i != j) {
                        if (FrequencyOfSymbols[i] + FrequencyOfSymbols[j] <= Minimum1) {
                            if (IspolzovannieVetvi[i] != IspolzovannieVetvi[j] || IspolzovannieVetvi[i] == 0 && IspolzovannieVetvi[j] == 0) {
                                Minimum1 = FrequencyOfSymbols[i] + FrequencyOfSymbols[j];
                                if (FrequencyOfSymbols[i] >= FrequencyOfSymbols[j]) {
                                    for (int h = 0; h < FrequencyOfSymbols.length; h++) {
                                        VetvSBolsheiFrequncy[h] = 0;
                                    }
                                    VetvSBolsheiFrequncy[i] = 2;
                                    VetvSBolsheiFrequncy[j] = 1;
                                }
                                for (int h = 0; h < FrequencyOfSymbols.length; h++) {
                                    IspolzovannieVetvi2[h] = 0;
                                }
                                IspolzovannieVetvi2[i] = 1;
                                IspolzovannieVetvi2[j] = 1;
                            }
                        }
                    }
                }
            }
            for (int h = 0; h < FrequencyOfSymbols.length; h++) { //Определение ветвей которые были задействованы только что
                if (IspolzovannieVetvi2[h] == 1) {
                    if (VetvSBolsheiFrequncy[h] == 2) {
                        DecodingStroka[h] = "1" + DecodingStroka[h];
                        FrequencyOfSymbols[h] = Minimum1;
                        for (int i = 0; i < FrequencyOfSymbols.length; i++) {
                            if (IspolzovannieVetvi[h] == IspolzovannieVetvi[i] && IspolzovannieVetvi[i] != 0 && h != i) {
                                DecodingStroka[i] = "1" + DecodingStroka[i];
                                FrequencyOfSymbols[i] = Minimum1;
                                IspolzovannieVetvi[i] = SchetchikVetvei;
                            }
                        }
                    }
                    if (VetvSBolsheiFrequncy[h] == 1) {
                        DecodingStroka[h] = "0" + DecodingStroka[h];
                        FrequencyOfSymbols[h] = Minimum1;
                        for (int i = 0; i < FrequencyOfSymbols.length; i++) {
                            if (IspolzovannieVetvi[h] == IspolzovannieVetvi[i] && IspolzovannieVetvi[i] != 0 && h != i) {
                                DecodingStroka[i] = "0" + DecodingStroka[i];
                                FrequencyOfSymbols[i] = Minimum1;
                                IspolzovannieVetvi[i] = SchetchikVetvei;
                            }
                        }
                    }
                    IspolzovannieVetvi[h] = SchetchikVetvei;
                }
            }
            SchetchikVetvei++;
            if (FrequencyOfSymbols[0] == Maximum) {
                break;
            }
        }
        return DecodingStroka;
    }

    public String CodingWithStringOnExit(int[] FrequencyOfSymbols, char[] IsxodnayastrokaVmassive, char[] IsxodnayastrokaBezpovtoreniiSymbols) {
        String[] DecodingStroka = new String[FrequencyOfSymbols.length];
        String zakodirovStroka = "";
        for (int i = 0; i < DecodingStroka.length; i++) {
            DecodingStroka[i] = "";
        }
        int[] IspolzovannieVetvi = new int[FrequencyOfSymbols.length];//Создаем массив, который будет следить за тем, какие ветви уже использованы
        int Maximum = 0;
        int[] IspolzovannieVetvi2 = new int[FrequencyOfSymbols.length];//Массив следящий за тем какие ветви использованы в данный момент
        int[] VetvSBolsheiFrequncy = new int[FrequencyOfSymbols.length];//Массив следящий за тем какое число больше
        for (int i = 0; i < FrequencyOfSymbols.length; i++) { //  Поиск наибольшего числа
            Maximum = FrequencyOfSymbols[i] + Maximum;
        }
        int Minimum1;
        int SchetchikVetvei = 1;
        while (true) {
            Minimum1 = Maximum;
            for (int i = 0; i < FrequencyOfSymbols.length; i++) {
                for (int j = 0; j < FrequencyOfSymbols.length; j++) {
                    if (i != j) {
                        if (FrequencyOfSymbols[i] + FrequencyOfSymbols[j] <= Minimum1) {
                            if (IspolzovannieVetvi[i] != IspolzovannieVetvi[j] || IspolzovannieVetvi[i] == 0 && IspolzovannieVetvi[j] == 0) {
                                Minimum1 = FrequencyOfSymbols[i] + FrequencyOfSymbols[j];
                                if (FrequencyOfSymbols[i] >= FrequencyOfSymbols[j]) {
                                    for (int h = 0; h < FrequencyOfSymbols.length; h++) {
                                        VetvSBolsheiFrequncy[h] = 0;
                                    }
                                    VetvSBolsheiFrequncy[i] = 2;
                                    VetvSBolsheiFrequncy[j] = 1;
                                }
                                for (int h = 0; h < FrequencyOfSymbols.length; h++) {
                                    IspolzovannieVetvi2[h] = 0;
                                }
                                IspolzovannieVetvi2[i] = 1;
                                IspolzovannieVetvi2[j] = 1;
                            }
                        }
                    }
                }
            }
            for (int h = 0; h < FrequencyOfSymbols.length; h++) { //Определение ветвей которые были задействованы только что
                if (IspolzovannieVetvi2[h] == 1) {
                    if (VetvSBolsheiFrequncy[h] == 2) {
                        DecodingStroka[h] = "1" + DecodingStroka[h];
                        FrequencyOfSymbols[h] = Minimum1;
                        for (int i = 0; i < FrequencyOfSymbols.length; i++) {
                            if (IspolzovannieVetvi[h] == IspolzovannieVetvi[i] && IspolzovannieVetvi[i] != 0 && h != i) {
                                DecodingStroka[i] = "1" + DecodingStroka[i];
                                FrequencyOfSymbols[i] = Minimum1;
                                IspolzovannieVetvi[i] = SchetchikVetvei;
                            }
                        }
                    }
                    if (VetvSBolsheiFrequncy[h] == 1) {
                        DecodingStroka[h] = "0" + DecodingStroka[h];
                        FrequencyOfSymbols[h] = Minimum1;
                        for (int i = 0; i < FrequencyOfSymbols.length; i++) {
                            if (IspolzovannieVetvi[h] == IspolzovannieVetvi[i] && IspolzovannieVetvi[i] != 0 && h != i) {
                                DecodingStroka[i] = "0" + DecodingStroka[i];
                                FrequencyOfSymbols[i] = Minimum1;
                                IspolzovannieVetvi[i] = SchetchikVetvei;
                            }
                        }
                    }
                    IspolzovannieVetvi[h] = SchetchikVetvei;
                }
            }
            SchetchikVetvei++;
            if (FrequencyOfSymbols[0] == Maximum) {
                break;
            }
        }
        for (int i = 0; i < IsxodnayastrokaVmassive.length; i++) {
            for (int j = 0; j < FrequencyOfSymbols.length; j++) {
                if (IsxodnayastrokaVmassive[i] == IsxodnayastrokaBezpovtoreniiSymbols[j]) {
                    zakodirovStroka = zakodirovStroka + DecodingStroka[j];
                }
            }
        }
        return zakodirovStroka;
    }
}
