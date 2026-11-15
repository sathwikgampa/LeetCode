class Solution {
    public int[] sortArray(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            smallest = Math.min(smallest,nums[i]);
            largest = Math.max(largest,nums[i]);
        }
        int count[] = new int[largest-smallest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]-smallest]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                nums[j] = i+smallest;
                count[i]--;
                j++;
            }
        }
        return nums;
    }
}