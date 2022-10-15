package org.example;

import org.example.medium.add_two_numbers.ListNode;
import org.example.medium.add_two_numbers.Solution;

public class Main {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(9);
    ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
    Solution sol = new Solution();
    ListNode res = sol.addTwoNumbers(l1, l2);
    while (res != null) {
      System.out.println(res.val);
      res = res.next;
    }
  }
}