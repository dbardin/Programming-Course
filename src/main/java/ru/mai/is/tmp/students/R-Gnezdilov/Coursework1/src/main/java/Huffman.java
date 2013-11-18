public class Huffman {
 public static void main(String[] args){
     Huffmaninput h1=new Huffmaninput();
     String str=h1.Input1();//Возвращаем значение введеной строки из метода Input1
     int r=str.length();
     char[] str2=new char[r];
     str.getChars(0,r,str2,0);
     char[] str1=h1.Sort1(r,str);//Сортируем введеную строку и возвращаем ее значение
     HuffmanLetters h2= new HuffmanLetters();
     int[] r2=h2.Frequency(str1,r);//Cоздаем массив, каждый член которого равен частоте соответствующего символа
     str1=h2.Letters(str1,r);//Изменяем массив char, чтобы не было повторений символов
     HuffmanTree h3=new HuffmanTree();
     int[] frs=new int[h2.ch]; //Массив сохраняющий частоту
     for (int i=0;i<h2.ch;i++){
         frs[i]=r2[i];
     }
     String[] str3=h3.Tree(r2); //Создаем массив, содержащий код каждого символа
     for (int i=0;i<h2.ch;i++){  //Выводим известные данные:символ частота код
         System.out.print("Символ - "+str1[i]+"; его частота = "+frs[i]+"; его код - "+str3[i]);
         System.out.println();
     }
     System.out.println("Строка, которую вы ввели - "+str+"; Закодированная строка - ");
     for (int i=0;i<str.length();i++){
         for (int j=0;j<h2.ch;j++){
             if (str2[i]==str1[j]){
                 System.out.print(str3[j]);
             }
         }
     }
 }
}
