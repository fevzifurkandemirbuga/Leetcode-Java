public class Problem_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int beg=0,end=0, max=0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (s.substring(beg,end).indexOf(c) == -1){
                end++;
            }else{
                beg+=s.substring(beg,end).indexOf(c)+1;
                end++;
            }
            max = Math.max(max, end-beg);
        }
        System.out.println(s.substring(beg,end));
        return max;
    }
}
