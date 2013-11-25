public class HuffmanLetters {
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
