import java.util.*;
public class Patterns{

    static void Pattern4(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
                System.out.println();
        }
    }
    static void Pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    static void Pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    
    }
    static void Pattern7(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    
    }
    static void Pattern8(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    
    }
    static void Pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int star=i;
            if(i>n){
                star=2*n-i;
            }

            for(int j=0;j<star;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void Pattern11(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    static void Pattern12(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();  
            space -=2; 
        }
    }
    static void Pattern13(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                    num= num + 1;

            }
            System.out.println(" ");
        }
    }
    static void Pattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void Pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        int n=sc.nextInt();
        // Pattern7(n);
        Pattern15(n);
    }
}
