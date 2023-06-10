class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long r = n - index - 1; // number of empty spaces to the right of max value
        long l = index;

        long hi = maxSum;
        long lo = 1;

        long res = 0;

        while (lo <= hi) {
            long mid = (hi - lo) / 2 + lo;
            long sum = mid;
            long rs, ls;

            if (mid > r) // calculating sum of right side
                rs = (mid - 1) * mid / 2 - (mid - r - 1) * (mid - r) / 2; // using n*(n+1)/2 formula on (mid -1)
            else
                rs = (mid - 1) * mid / 2 + (r - mid + 1);

            if (mid > l) // calculating sum of left side
                ls = (mid - 1) * mid / 2 - (mid - l - 1) * (mid - l) / 2;
            else
                ls = (mid - 1) * mid / 2 + (l - mid + 1);

            sum += rs + ls;
            if (sum <= maxSum) {
                res = mid;
                lo = mid + 1;
            } else
                hi = mid - 1;
        }
        return (int) res;
    }
}