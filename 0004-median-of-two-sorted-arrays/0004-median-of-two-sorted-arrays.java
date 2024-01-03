class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int arr[]=new int[n1.length+n2.length];
        int i=0,j=0,k=0;
        while(i<n1.length && j<n2.length){
            if(n1[i]<n2[j]){
                arr[k++]=n1[i++];
            }
            else{
                arr[k++]=n2[j++];
            }
        }
        while(i<n1.length)
        arr[k++]=n1[i++];
        while(j<n2.length)
        arr[k++]=n2[j++];
        int n=arr.length;
        double sum=0;
        if(n%2==0){
            sum=(double)(arr[n / 2 - 1] + arr[(n / 2)]) / 2.0;
        }
        else
        sum=(double)arr[n/2];   
        return sum;

    }
}