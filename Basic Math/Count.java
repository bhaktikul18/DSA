import java.util.*;
public class Count{
    public static void  main(String[] args){
        int n;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        n=sc.nextInt();

        while(n > 0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}