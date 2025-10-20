class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= nums.length; i++){
            int bal = target - nums[i];
            if(map.containsKey(bal)){
                return new int[] {map.get(bal), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}