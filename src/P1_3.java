import java.util.Scanner;

public class P1_3 {
    static void factor(int x){
        int f=1;
        if (x==0) System.out.println(f);
        else for(int i=1;i<=x;i++) f*=i;
        System.out.println(f);
    }

    public static void main(String[] args) {
        int a;
        Scanner num=new Scanner(System.in);
        a=num.nextInt();
        factor(a);
        //System.out.println(a);
    }
}
