import static org.junit.Assert.*;

import org.junit.Test;

public class Huffman1Test {
    @Test
    public void testMain() throws Exception {
        HuffmanTree1 HuffmanTree = new HuffmanTree1();
        int[] Frequency = {2, 1, 3, 4, 2, 2, 1};
        String stroka = "0010100101100011111101011000101001110110";//Пишем сюда ответ который должен вывести метод после кодирования
        char[] Otsortirovannayastroka = {' ', '!', 'b', 'e', 'o', 'p', 'r'}; //Пишем сюда символы в алфавитном порядке, те символы которые использовались изначально
        char[] IsxodnyaStrokaVmassive = {'b', 'e', 'e', 'p', ' ', 'b', 'o', 'o', 'p', ' ', 'b', 'e', 'e', 'r', '!'}; //Массив символов исходной строки в том порядке в котором они идут
        String strokaСoding = HuffmanTree.CodingWithStringOnExit(Frequency, IsxodnyaStrokaVmassive, Otsortirovannayastroka);  //Производим кодирование
        assertEquals(stroka, strokaСoding);  //Сравниваем правильный ответ с декодированием
    }

    @Test
    public void test1Main() throws Exception {
        HuffmanLetters1 HuffmanLetters = new HuffmanLetters1();
        int[] Frequency = {15, 15, 15, 15, 15, 15, 15};//Сюда в массив в каждую ячейку пишем сумма всех частот символов
        String stroka = "beep boop beer!";//Пишем сюда строку, которая должна получиться после декодирования
        String[] Otsortirovannayastroka = {" ", "!", "b", "e", "o", "p", "r"}; //Пишем сюда символы в алфавитном порядке, те символы которые использовались изначально
        String[] FrequencyOfSymbols = {"110", "0110", "00", "10", "111", "010", "0111"}; //Массив частоты каждого символа
        String IsxodnyaStroka = "0010100101100011111101011000101001110110";//Сюда пишем исходную строку которая нужно декодировать
        String strokaDecoding = HuffmanLetters.Decoding(IsxodnyaStroka, Frequency, FrequencyOfSymbols, Otsortirovannayastroka);  //Производим кодирование
        assertEquals(stroka, strokaDecoding);  //Сравниваем правильный ответ с декодированием
    }
}



