import java.util.Scanner;
import java.util.Random;

public class P1_2 {
    static void s_out(int []x){
        int i = 0;
        while (i <x.length) {
            System.out.print(x[i]+" ");
            i++;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int a;
        int[]mas=new int[5];
        Scanner var=new Scanner(System.in);
        Random num=new Random();

        System.out.println("Выберите способ генерирования массива\n" +
                "1-метод random\n2-класс Random");
        a= var.nextInt();

        switch (a){
            case(1):
                for(int i=0;i< mas.length;i++){
                    mas[i]=(int)(Math.random()*10);
                }
                break;
            case(2):
                int i=0;
                while(i< mas.length) {
                    int b=num.nextInt();
                    if (b>0&&b<100) {
                        mas[i]=b;
                        i++;
                    }
                }
                break;
        }
        s_out(mas);

        for(int i = 0; i <mas.length-1; i++){
            for (int j = i+1; j <mas.length; j++) {
                if (mas[i]>mas[j]){
                    int per=mas[i];
                    mas[i]=mas[j];
                    mas[j]=per;
                }
            }
        }

        s_out(mas);
    }
}
