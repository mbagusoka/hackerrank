package com.test.kata.leetcode;

import com.test.kata.online.LeetCode;
import com.test.kata.struct.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testOne() {
        ListNode firstInput = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode secondInput = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = LeetCode.addTwoNumbers(firstInput, secondInput);
        Assert.assertEquals(new ListNode(7, new ListNode(0, new ListNode(8))), result);
    }
}
