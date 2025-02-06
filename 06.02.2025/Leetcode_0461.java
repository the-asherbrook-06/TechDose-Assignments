class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, res = 0;
        while(xor != 0) {
            xor = xor & (xor - 1);
            res += 1;
        }

        return res;
    }
}