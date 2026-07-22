class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        l[0]=1;
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]*nums[i-1];

        }
        r[nums.length-1]=1;
        for(int j=nums.length-2;j>=0;j--){
            r[j]=r[j+1]*nums[j+1];
        }
        int ans[]=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            ans[k]=l[k]*r[k];
        }
        return ans;
    }
}  
