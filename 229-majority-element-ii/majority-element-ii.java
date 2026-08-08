class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0,count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 =Integer.MIN_VALUE ;
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1 = nums[i];
            }else if(count2==0 && nums[i]!=ele1){
                count2=1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]) count1++;
            else if(ele2 == nums[i]) count2++;
            else {count1--;count2--;}
        }
        int majority1 = 0,majority2 = 0;
        for(int i =0;i<n;i++){
            if(nums[i]==ele1) majority1++;
            if(nums[i]==ele2) majority2++;
        }
        int mini = n/3+1;
        if(majority1 >= mini) result.add(ele1);
        if(majority2 >= mini && ele1 != ele2) result.add(ele2);
        return result;
        
    }
}
