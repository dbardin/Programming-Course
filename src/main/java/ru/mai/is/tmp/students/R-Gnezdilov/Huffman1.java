import java.util.Arrays;
class Huffmaninput {
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
class HuffmanLetters {
    int ch;
    public int[] Frequency(char[] str1,int r){
        ch=1; //Считаем частоту символов
        for (int i=0;i<r-1;i++){
            if (str1[i]!=str1[i+1]) {
                ch++;
            }
        }
        int[] str=new int[ch];
        for(int i=0;i<ch;i++){
            str[i]=1;
        }
        int j=0;
        for (int i=0;i<r-1;i++){  //Записываем частоту в массив
            if (str1[i]==str1[i+1]) {
                str[j]=str[j]+1;
            }   else {
                j++;
            }
        }
        return str;//Возвращаем частоту
    }
    public char[] Letters(char[] str1,int r){
        char[] str=new char[ch]; //Убираем символы, которые повторяются, оставляем всего лишь один дубликат
        str[0]=str1[0];
        int j=1;
        for (int i=0;i<r-1;i++){
            if (str1[i]!=str1[i+1]) {
                str[j]=str1[i+1];
                j++;
            }
        }
        return str;
    }
}
class HuffmanTree {
    public String[] Tree(int[] fr){
        String[] r=new String[fr.length];
        for (int i=0;i<r.length;i++){
            r[i]="";
        }
        int[] t=new int[fr.length];//Создаем массив, который будет следить за тем, какие ветви уже использованы
        int s=0;
        int[] t1=new int[fr.length];//Массив следящий за тем какие ветви использованы в данный момент
        int[] t2=new int[fr.length];//Массив следящий за тем какое число больше
        for (int i=0;i<fr.length;i++){ //  Поиск наибольшего числа
            s=fr[i]+s;
        }
        int min;
        int chvt=1;
        while(true){
            min=s;
            for(int i=0;i<fr.length;i++){
                for(int j=0;j<fr.length;j++){
                    if (i!=j) {
                        if (fr[i]+fr[j]<=min){
                            if (t[i]!=t[j]||t[i]==0&&t[j]==0){
                                min=fr[i]+fr[j];
                                if (fr[i]>=fr[j]){
                                    for(int h=0;h<fr.length;h++){
                                        t2[h]=0;
                                    }
                                    t2[i]=2;
                                    t2[j]=1;
                                }
                                for(int h=0;h<fr.length;h++){
                                    t1[h]=0;
                                }
                                t1[i]=1;
                                t1[j]=1;
                            }
                        }
                    }
                }
            }
            for(int h=0;h<fr.length;h++){ //Определение ветвей которые были задействованы только что и изменение соответствующих параметров
                if (t1[h]==1) {
                    if (t2[h]==2){
                        r[h]="1"+r[h];
                        fr[h]=min;
                        for (int i=0;i<fr.length;i++){
                            if (t[h]==t[i]&&t[i]!=0&&h!=i) {
                                r[i]="1"+r[i];
                                fr[i]=min;
                                t[i]=chvt;
                            }
                        }
                    }
                    if (t2[h]==1){
                        r[h]="0"+r[h];
                        fr[h]=min;
                        for (int i=0;i<fr.length;i++){
                            if (t[h]==t[i]&&t[i]!=0&&h!=i) {
                                r[i]="0"+r[i];
                                fr[i]=min;
                                t[i]=chvt;
                            }
                        }
                    }
                    t[h]=chvt;
                }
            }
            chvt++;
            if (fr[0]==s) {break;}
        }
        return r;
    }
}
public class Huffman1 {
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
