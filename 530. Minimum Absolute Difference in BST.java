class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ll = new ArrayList<Integer>();
        inordertrav(root, ll);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ll.size() / 2; i++) {
            if (min == 0)
                break;
            int min1 = Math.abs(ll.get(i) - ll.get(i + 1));
            int min2 = Math.abs(ll.get(ll.size() - i - 1) - ll.get(ll.size() - i - 2));
            int m = Math.min(min1, min2);
            if (min > m)
                min = m;
        }
        return min;
    }

    public void inordertrav(TreeNode root, ArrayList<Integer> ll) {
        if (root == null)
            return;
        inordertrav(root.left, ll);
        ll.add(root.val);
        inordertrav(root.right, ll);
    }
}