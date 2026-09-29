class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefmax=new int[n];
        int[] suffmax=new int[n];
        prefmax[0]=height[0];
        for(int i=1;i<n;i++){
            prefmax[i]=Math.max(prefmax[i-1],height[i]);
        }
        suffmax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
            suffmax[i]=Math.max(suffmax[i+1],height[i]);
        }
        int total =0;
        for(int i=0;i<n;i++){
                total+=Math.min(prefmax[i], suffmax[i])-height[i] ;
        }
        return total;
    }
}