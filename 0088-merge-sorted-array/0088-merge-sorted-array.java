class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr3=new int[m+n];
        int index=0;
        int left=0;
        int right=0;
        while(left<m&&right<n){
            if(nums1[left]<nums2[right]){
                arr3[index]=nums1[left];
                index++;
                left++;
            }
            else{
                arr3[index]=nums2[right];
                index++;
                right++;
            }
        }
        while(left<m){
            arr3[index++]=nums1[left++];
        }
        while(right<n){
            arr3[index++]=nums2[right++];
        }
        for(int i=0;i<n+m;i++){
            
                nums1[i]=arr3[i];

        }
    }
}