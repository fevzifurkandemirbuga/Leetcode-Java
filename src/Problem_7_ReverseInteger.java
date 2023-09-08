public class Problem_7_ReverseInteger {
    public int reverse(int x){
        long num=0;
        boolean negative=false;
        if (x<0){
            negative=true;
            x*=-1;
        }
        while (x>0){
            num*=10;
            num+=x%10;
            x/=10;
        }
        if (num>Integer.MAX_VALUE || num<Integer.MIN_VALUE) return 0;

        return (negative) ? (int) -num: (int)num;

    }
}
