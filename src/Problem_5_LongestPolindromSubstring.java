public class Problem_5_LongestPolindromSubstring {
    public String longestPalindrome(String s) {
        String result="",str="";
        if (s.length()<=1) return s;
        for (int i=0;i<s.length()-1;i++){
            for (int j=i;j<s.length();j++){
                if(result.length()>s.length()-i){
                    return result;
                }
                str=s.charAt(j)+str;
                if (str.equals(s.substring(i,j+1)) && str.length()>result.length()){
                    result=str;

                }
            }
            str="";
        }
        return result;

    }
}
