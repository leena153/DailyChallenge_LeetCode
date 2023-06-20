class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avg = new int[n];
        int ele = 2*k + 1;
        Arrays.fill(avg, -1);
        if(2*k>=n)     return avg;
        long sum = 0;
        for(int i = 0; i <= 2*k ; i++)  sum += nums[i];
        avg[k] = (int)Math.floor(sum/ele);
        for(int i = k+1; i < n-k; i++){
            sum += nums[i + k];
            sum -= nums[i - k - 1];
            avg[i] = (int)Math.floor(sum/ele);
        }
        return avg;
    }
}