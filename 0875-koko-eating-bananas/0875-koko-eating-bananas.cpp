class Solution {
public:
   int minEatingSpeed(vector<int>& piles, int H) {
        int l = 1, r = 1000000000;
        while (l <= r) {
            long long m = (l)+(r-l) / 2, total = 0;
            for (int p : piles)
                total += (p + m - 1) / m;
            if (total > H)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }
};