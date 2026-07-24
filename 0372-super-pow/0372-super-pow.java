class Solution {

    int MOD = 1337;

    public int superPow(int a, int[] b) {
        int ans = 1;
        a %= MOD;

        for (int i = 0; i < b.length; i++) {
            int digit = b[i];
            ans = (pow(ans, 10) * pow(a, digit)) % MOD;
        }

        return ans;
    }

    private int pow(int a, int n) {
        int res = 1;
        a %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * a) % MOD;
            }

            a = (a * a) % MOD;
            n >>= 1;
        }

        return res;
    }
}