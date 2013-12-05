public class HuffmanTree {
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
            for(int h=0;h<fr.length;h++){ //Определение ветвей которые были задействованы только что
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
