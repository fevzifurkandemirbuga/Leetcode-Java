public class Problem_12_IntegerToRoman {
    public String intRoman2(int num){
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        int count;
        for (int i=0; i<nums.length; i++){
            count=num/nums[i];
            result+=romans[i].repeat(count);
            num-=nums[i]*count;
        }
        return result;

    }
}
