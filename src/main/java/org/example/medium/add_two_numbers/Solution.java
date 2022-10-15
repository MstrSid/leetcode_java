package org.example.medium.add_two_numbers;

import java.math.BigInteger;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node = null;
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    StringBuilder sum = new StringBuilder();

    while (l1 != null) {
      s1.append(l1.val);
      l1 = l1.next;
    }

    while (l2 != null) {
      s2.append(l2.val);
      l2 = l2.next;
    }

    BigInteger res1 = new BigInteger(String.valueOf(s1.reverse()));
    BigInteger res2 = new BigInteger(String.valueOf(s2.reverse()));
    BigInteger bigSum = res1.add(res2);

    sum.append(bigSum);

    int i = 0;
    while (i < sum.length()) {
      if (node == null) {
        node = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(i))), null);
      } else {
        node = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(i))), node);
      }
      i++;
    }
    return node;
  }
}
