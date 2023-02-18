class Solution {
  public List < Integer > addToArrayForm(int[] nums, int k) {
    LinkedList < Integer > ans = new LinkedList < > ();
    int i = nums.length - 1, n = 0, carry = 0;
    while (i >= 0 || k != 0) {
      if (i < 0) n = 0;
      else n = nums[i];
      int sum = carry + k % 10 + n;
      ans.addFirst(sum % 10);
      carry = sum / 10;
      k = k / 10;
      i--;
    }
    if (carry != 0) ans.addFirst(carry);
    return ans;
  }
}