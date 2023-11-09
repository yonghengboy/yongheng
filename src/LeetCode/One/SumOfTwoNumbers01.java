/*
package LeetCode.One;
import java.util.Scanner;
public class SumOfTwoNumbers01 {
    public static void main(String[] args) {
         int[]a={2,5,5,11};
         int b=10;
         Solution001 v = new Solution001();
         v.twoSum(a,b);
    }
        }

//2023.11.8 力扣001 两数之和
class Solution001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    System.out.println("["+i+","+j+"]");
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

//2023.11.8 力扣002 两数相加

 Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }
}*/
