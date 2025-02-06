class Solution {
    public int[] decode(int[] encoded) {
        int a = 0, n = encoded.length + 1;
        int res[] = new int[n];

        for(int i = 1; i <= n; i++) a ^= i;
        for(int i = 1; i < n - 1; i+=2) a ^= encoded[i];
        res[0] = a;

        for(int i = 0; i < n-1; i++) res[i+1] = res[i] ^ encoded[i];
        return res;
    }
}