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
        return str;
     }
     public char[] Sort1(int r,String str1){
         char[] str=new char[r];//Создаем массив char
         str1.getChars(0,r,str,0);//Строку разбираем в массив char, посимвольно
         Arrays.sort(str);//Сортируем массив char
         return str;
     }
    public String Input2(){
        Input t1=new Input();
        String str;//Создаем объект класса input для ввода данных с клавиатуры
        while(true){ //Цикл на случай, если пользователь не ввел данные
            str=t1.getUserInput("Напишите coding, если вы хотите закодировать строку, или decoding, если вы хотите декодировать строку");//Вводим данные с клавиатуры
            if (str==null) {
                System.out.println("Ошибка, вы ввели не то, что следовало, попробуйте еще раз");
                } else if (!str.equals("coding")&&!str.equals("decoding")) {
                    System.out.println("Ошибка, вы ввели не то, что следовало, попробуйте еще раз");
                } else {break;}//Если строка не равна одному из заданных слов, то цикл начинается сначала и просит снова ввести данные, если же строка не пустая то цикл прекращается
            }
        return str;
    }
    public String Input3(){
        Input t1=new Input();
        char[] str2;
        boolean g;
        String str;//Создаем объект класса input для ввода данных с клавиатуры
        while(true){ //Цикл на случай, если пользователь не ввел данные
            g=true;
            str=t1.getUserInput("Введите то, что следует декодировать");//Вводим данные с клавиатуры
            if (str==null) {
                System.out.println("Ошибка, вы ничего не ввели, попробуйте еще раз");
                g=false;
            } else {//Обрабатываем введеные данные, проверяем соответствуют ли они условиям
                str2=new char[str.length()];
                str.getChars(0,str.length(),str2,0);
                for (int i=0;i<str.length();i++){
                    if (str2[i]!='1'&&str2[i]!='0'){
                        g=false;
                    }
                }
            }
            if(g){
                break;
            }
            else {
                System.out.println("Вы ввели строку неверного типа, попробуйте еще раз, она должна содержать только цифры 1 и 0");
            }
        }
        return str;
    }
    public String Input4(){
        Input t1=new Input();
        boolean g;
        String str;//Создаем объект класса input для ввода данных с клавиатуры
        while(true){ //Цикл на случай, если пользователь не ввел данные
            g=true;
            str=t1.getUserInput("Введите символы которые были использованы, цельной строкой без пробелов, только если он не использовался в качестве символа");//Вводим данные с клавиатуры
            if (str==null) {
                System.out.println("Ошибка, вы ничего не ввели, попробуйте еще раз");
            } else {          //Проверка на наличие повторяющихся символов
                for (int i=0;i<str.length();i++) {
                    for (int j=0;j<str.length();j++){
                        if (str.charAt(i)==str.charAt(j)&&i!=j){
                            g=false;
                        }
                    }

                }
            }
            if (g){break;} else {
            System.out.println("Вы ввели строку, в которой есть повторяющиеся символы, а такого быть не должно, попробуйте еще раз");
            }
        }
        return str;
    }
    public int[] Input5(char[] r){
        Input t1=new Input();
        boolean g;
        String str;
        int[] r2=new int[r.length];
        for (int i=0;i<r.length;i++){
            while (true){
                g=true;
                str=t1.getUserInput("Введите частоту "+r[i]+" символа");
                try{
                    r2[i]=Integer.parseInt(str);
                } catch(NumberFormatException e){
                    g=false;
                }
                if (g) {break;} else {
                    System.out.println("Вы ввели неправильное число, попробуйте еще раз");
                }
            }
        }
        return r2;
    }
}

