class Solution {
    public boolean isPalindrome(int x) {
        int res=0 , temp=0;
        temp = x;
        while(x>0){
            res=res*10 + x % 10;
            x/=10;
        }
        if(temp==res){
            return true;
        }
        else if(x<0){
            return false;
        }
       else{
            return false;
        }
    }
}