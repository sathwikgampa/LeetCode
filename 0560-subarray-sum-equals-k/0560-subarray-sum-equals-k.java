class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        int count = 0;
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int currentSum = 0;
            for(int j=i;j<nums.length;j++){
            currentSum = (i==0) ? prefix[j] : prefix[j] - prefix[i-1];
            if(currentSum == k){
                count++;
            }
            }
        }
        return count;
    }
}