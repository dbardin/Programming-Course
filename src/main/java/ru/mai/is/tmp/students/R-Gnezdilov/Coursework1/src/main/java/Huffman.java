public class Huffman {
 public static void main(String[] args){
     Huffmaninput h1=new Huffmaninput();
     HuffmanLetters h2= new HuffmanLetters();
     HuffmanTree h3=new HuffmanTree();
     String str;
     int r;
     char[] str2;
     char[] str1;
     int[] r2;
     int[] frs;
     String[] str3;
     String[] str5;
     String str4=h1.Input2(); //Возвращаем значение того, что следует выполнить кодирование или декодирование
     if (str4.equals("coding")){
         str=h1.Input1();//Возвращаем значение введеной строки из метода Input1
         r=str.length();
         str2=new char[r];
         str.getChars(0,r,str2,0);
         str1=h1.Sort1(r,str);//Сортируем введеную строку и возвращаем ее значение
         r2=h2.Frequency(str1,r);//Cоздаем массив, каждый член которого равен частоте соответствующего символа
         str1=h2.Letters(str1,r);//Изменяем массив char, чтобы не было повторений символов
         frs=new int[h2.ch]; //Массив сохраняющий частоту
         for (int i=0;i<h2.ch;i++){
             frs[i]=r2[i];
         }
         str3=h3.Tree(r2); //Создаем массив, содержащий код каждого символа
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
     }  else {
         while(true){
         str=h1.Input3();//Возвращаем значение введеной строки из метода Input3
         boolean check=true;
         str4=h1.Input4();//Возвращаем символы которые были закодированы
         str1=new char[str4.length()];
         str4.getChars(0,str4.length(),str1,0); //Создаем массив символов из той строки
         r2=new int[str4.length()];
         r2=h1.Input5(str1); //Создаем массив частот
         str2=str1;
         str1=h2.Sort2(r2,str2); //Сортируем массив char, чтобы символы были в алф порядке
         str5=h2.Change(str1);//Из массива Char делаем массив String
         r2=h2.Sort1(r2,str2);   //Сортируем массив int, чтобы частоты соответствовали отсортированным символам
         str3=h3.Tree(r2); //Создаем массив, содержащий код каждого символа
         System.out.println("Строка, которую вы ввели - "+str+"; Декодированная строка - ");
         str=h2.Decoding(str,r2,str3,str5);
         for (int i=0;i<str.length();i++){
             check=true;
             if (str.charAt(i)=='0'||str.charAt(i)=='1'){
                 check=false;
             }
         }
         if (check){
             System.out.print(str);
             break;
         } else{
             System.out.println("Видимо вы ввели неверные исходные данные, попробуйте еще раз");
         }
         }
     }
 }
}


