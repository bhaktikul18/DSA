class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
            if(sum==num){
                return true;
            }
            else{
                return false;
            }
        
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        Solution obj=new Solution();
        boolean result=obj.checkPerfectNumber(num);
        System.out.print(result);        
    }
}