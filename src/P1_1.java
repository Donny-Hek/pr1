import java.util.Scanner;

public class P1_1 {
    public static void main(String[] args) {
        int [] mas=new int[5];
        int sum=0, i;
        Scanner num=new Scanner(System.in);
        for (i=0;i<mas.length;i++){
            mas[i]=num.nextInt();
            sum+=mas[i];
        }
        System.out.println(sum);
        sum=0;
        i=0;
        while(i<mas.length){
            sum+=mas[i];
            i++;
        }
        System.out.println(sum);
        sum=0;
        i=0;
        do{
            sum+=mas[i];
            i++;
        } while(i<mas.length);
        System.out.println(sum);
    }
}
