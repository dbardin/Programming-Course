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
    public int[] Sort1(int[] r,char[] r2){
        char tmp;
        int tmp1;
        for(int i=0;i<r.length-1;i++){
            for(int j=i+1;j<r.length;j++){
                if(r2[i]>r2[j]){
                    tmp=r2[i];
                    r2[i]=r2[j];
                    r2[j]=tmp;
                    tmp1=r[i];
                    r[i]=r[j];
                    r[j]=tmp1;
                }
            }
        }
        return r;
    }
    public char[] Sort2(int[] r,char[] r2){
        char tmp;
        int tmp1;
        for(int i=0;i<r.length-1;i++){
            for(int j=i+1;j<r.length;j++){
                if(r2[i]>r2[j]){
                    tmp=r2[i];
                    r2[i]=r2[j];
                    r2[j]=tmp;
                    tmp1=r[i];
                    r[i]=r[j];
                    r[j]=tmp1;
                }
            }
        }
        return r2;
    }
    public String[] Change(char[] str){
        String[] str1=new String[str.length];
        for (int i=0;i<str.length;i++){
            str1[i]=""+str[i] ;
        }
        return str1;
    }
    public String Decoding(String str,int[] r2,String[] str3,String[] str5){
        StringBuffer b=new StringBuffer(str);
        String stroka;
        int max=0; //Поиск максимальной частоты
        for (int i=0;i<r2.length;i++){
            if (r2[i]>max){
                max=r2[i];
            }
        }
        int[] k=new int[str3.length];
        int f=str3.length;
        for (int d=0;d<max;d++){
            int min=b.length();
            for (int i=0;i<f;i++) {   //Декодируем строку заменой символов с конца
                k[i]=b.indexOf(str3[i]);
            }
            for (int i=0;i<f;i++){
                if(k[i]<min&&k[i]>=0) {
                    min=k[i];
                }
            }
            for (int i=0;i<f;i++){
                if(k[i]==min) {
                    b=b.replace(k[i],k[i]+str3[i].length(),str5[i]);
                }
            }
        }
        return stroka=b.toString();
    }
}