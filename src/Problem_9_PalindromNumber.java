public class Problem_9_PalindromNumber {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int x1=x,reversed=0;
        while (x>0){
            reversed=reversed*10+x%10;
            x/=10;
        }
        return reversed==x1;
    }
}
