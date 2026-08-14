class Solution {
    public boolean isPalindrome(int x) {
        int lastdigit=0;
        int reverse=0;
        int duplicate=x;
        while(x > 0){
            lastdigit=x%10;
            reverse=(reverse*10)+lastdigit;
            x=x/10;
        }
        if(duplicate==reverse){
            return true;
        }else{
            return false;
        }

    }
}