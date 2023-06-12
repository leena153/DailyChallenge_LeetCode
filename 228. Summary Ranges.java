class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();
        if (nums.length == 0)
            return ranges;
        int a = nums[0];
        if (nums.length == 1) {
            ranges.add(Integer.toString(a));
            return ranges;
        }
        int b = a;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1)
                if (Math.abs(nums[i] - nums[i + 1]) == 1)
                    b = nums[i + 1];
                else {
                    if (a != b && (a < b))
                        ranges.add(Integer.toString(a) + "->" + Integer.toString(b));
                    else
                        ranges.add(Integer.toString(a));
                    a = nums[i + 1];
                }
            else if (a != b && (a < b))
                ranges.add(Integer.toString(a) + "->" + Integer.toString(b));
            else
                ranges.add(Integer.toString(a));
        }
        return ranges;
    }
}