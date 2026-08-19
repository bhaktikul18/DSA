import java.util.*;
public class Recursion{
    public static void name(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Bhakti");
        name(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        int n=sc.nextInt();
        name(1,n);
    }
} 