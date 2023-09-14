public class Problem_02_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1 = 0, n2 = 0,kat=1;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                n1 += kat* l1.val;
                l1=l1.next;
            }
            if (l2 != null) {
                n2 += kat* l2.val;
                l2 = l2.next;
            }
            kat*=10;
        }
        String sum = String.valueOf(n1 + n2);
        ListNode result = null;
        for (int i = 0; i <sum.length(); i++){
            result = new ListNode((Integer.parseInt(String.valueOf((sum.charAt(i))))), result);

        }
        return result;
    }
}
