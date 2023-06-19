class Solution {
    public int largestAltitude(int[] gain) {
        int a = 0;
        int b;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            b = gain[i]+a;
            max = Math.max(max, b);
            a = b;
        }
        return max;
    }
}