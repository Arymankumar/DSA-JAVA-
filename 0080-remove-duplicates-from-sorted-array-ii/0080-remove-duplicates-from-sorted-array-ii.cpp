class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
       int a=0;
       for(int i=0;i<nums.size();i++){
        if(a<2 || nums[i]!=nums[a-2]){
            nums[a]=nums[i];
            a++;
        }
       }
       return a;
    }
};