class Solution {
   public void combination(int ind , int sum , List<Integer> nums , int[] candidates, List<List<Integer>> ans){
        if(sum == 0){
            ans.add(new ArrayList<>(nums) );
            return;
        }
        if (sum < 0 || ind == candidates.length) return; 
        nums.add(candidates[ind]);
        combination(ind+1,sum-candidates[ind],nums,candidates,ans);
        nums.remove(nums.size()-1);

        for(int i = ind+1;i<candidates.length;i++){
            if(candidates[i]!=candidates[ind]){
                combination(i,sum,nums,candidates,ans);
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        Arrays.sort(candidates);
        combination(0,target,nums,candidates,ans);
        return ans;
    }
}