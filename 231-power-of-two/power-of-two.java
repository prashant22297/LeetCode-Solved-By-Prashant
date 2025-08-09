class Solution {
    public boolean isPowerOfTwo(int n) {
        // Method 1 - Count number of set bits , even number has only 1 set bit
        // return n > 0 && Integer.bitCount(n) == 1;

        // Method 2 - Recusion , divide the n recusively by 2.and check 

        // Method 3 - Bit manipulaion- N has only one set bit and when we take and with n-1, it unsets all the bits and thus making it zero.
        return n > 0 && (n & (n - 1)) == 0;
    }
}