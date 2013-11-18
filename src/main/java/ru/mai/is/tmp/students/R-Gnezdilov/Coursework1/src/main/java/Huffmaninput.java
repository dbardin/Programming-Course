import java.util.Arrays;
public class Huffmaninput {
     public String Input1(){
        Input t1=new Input();
        String str;//Создаем объект класса input для ввода данных с клавиатуры
        while(true){ //Цикл на случай, если пользователь не ввел данные
        str=t1.getUserInput("Введите то, что следует перекодировать");//Вводим данные с клавиатуры
        if (str==null) {
            System.out.println("Ошибка, вы ничего не ввели, попробуйте еще раз");
        } else {break;}//Если строка пустая, то цикл начинается сначала и просит снова ввести данные, если же строка не пустая то цикл прекращается
        }
        int r=str.length();//Измеряем длину строки
        return str;
     }
     public char[] Sort1(int r,String str1){
         char[] str=new char[r];//Создаем массив char
         str1.getChars(0,r,str,0);//Строку разбираем в массив char, посимвольно
         Arrays.sort(str);//Сортируем массив char
         return str;
     }
}
