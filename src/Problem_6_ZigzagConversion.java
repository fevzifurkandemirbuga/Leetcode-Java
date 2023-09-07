import java.util.Arrays;

public class Problem_6_ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows > s.length()) return s;
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        int i = 0, index = 0;
        String result = "";
        while (i < s.length()) {

            if (index == numRows) index = -numRows + 2;
            arr[Math.abs(index) % numRows] = arr[Math.abs(index) % numRows] + s.charAt(i);
            index++;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            result += arr[j];
            System.out.println(arr[j]);
        }
        return result;

    }
}
