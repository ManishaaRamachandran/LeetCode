class Solution {
    public void reverse(int a , int d , int[] nums){
        while(a < d){
            int temp = nums[a];
            nums[a] = nums[d];
            nums[d] = temp;
            a++;
            d--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);
    }
}