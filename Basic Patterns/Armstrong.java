import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number=");
        int n=sc.nextInt();
        int Ld=0;
        int sum=0;
        int N=n;

        while(n > 0){
            Ld=n%10;
            sum=sum+(Ld*Ld*Ld);
            n=n/10;
        }
        if(sum==N){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}