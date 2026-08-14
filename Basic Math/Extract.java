import java.util.*;
public class Extract {
    public static int Count1(int x){
        int lastdigit=0;
        int reverse=0;
        while(x > 0){
            lastdigit=x%10;
            x=x/10;
            reverse=reverse*10+lastdigit;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        int x=sc.nextInt();
        int result=Count1(x);
        System.out.print(result);
    }
}
