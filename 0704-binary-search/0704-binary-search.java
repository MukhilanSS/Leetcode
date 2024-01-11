class Solution {
    public int search(int[] arr, int k) {
        int n=arr.length;
        int ans=-1;
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==k){
            ans=mid;
            break;
            }
            else if(arr[mid]>k)
            right=mid-1;
            else if(arr[mid]<k)
            left=mid+1;
            
        }
        System.out.print(ans);  
        return ans;   
    }
}