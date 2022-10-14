package org.example;

import org.example.medium.add_two_numbers.ListNode;

public class Main {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    StringBuilder res = new StringBuilder();

    while (l1 != null) {
      s1.append(l1.val);
      l1 = l1.next;
    }

    while (l2 != null) {
      s2.append(l2.val);
      l2 = l2.next;
    }

    System.out.println(s1.reverse());
    System.out.println(s2.reverse());

    res.append(Integer.parseInt(String.valueOf(s1.reverse())) + Integer.parseInt(
        String.valueOf(s2.reverse()))).reverse();

    ListNode result = new ListNode(0, null);

    int i = 0;
    while (i < res.length()) {
      ListNode elem = new ListNode();
      i++;
    }
    for (int i = 0; i < res.length() - 1; i++) {
//      if (result.next == null) {
//        result.val = Integer.parseInt(String.valueOf(res.charAt(i)));
//        result.next = new ListNode(Integer.parseInt(String.valueOf(res.charAt(i + 1))), null);
//      } else {
//        ListNode elem = new ListNode(0, null);
//        elem.val = Integer.parseInt(String.valueOf(res.charAt(i)));
//        elem.next = new ListNode(Integer.parseInt(String.valueOf(res.charAt(i + 1))), null);
//        result.next = elem;
//      }
      result.
    }

    System.out.println(result.val + " " + result.next.val);

  }
}