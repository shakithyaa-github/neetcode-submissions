class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0;
        int n=height.length;
        int right=n-1;
        int max=0;
    
        while(left<right){
            maxarea=(right-left)*Math.min(height[left],height[right]);
            max=Math.max(maxarea,max);
        
        if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;        


        
    }
}