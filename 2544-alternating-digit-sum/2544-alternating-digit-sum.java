// class Solution {
//     public int alternateDigitSum(int n) {
//         String s=""+n;
//         int k=s.length();
//         int arr[]=new int[k];
//         k--;
//         while(n>0)
//         {
//             arr[k--]=n%10;
//             n/=10;
//         }
//         int sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(i%2==0)
//             {
//                 sum+=arr[i];
//             }
//             else
//             {
//                 sum-=arr[i];
//             }
//         }
//         return sum;
//     }
// }
class Solution {
    public int alternateDigitSum(int n) {
        String num=String.valueOf(n);
        System.out.print(num);
        char ch[]= num.toCharArray();
        int m=ch.length;
        int sum=0;
        for(int i=0;i<m;i++)
        {
            if(i%2==0)
            {
               sum+=ch[i]-'0'; 
            }
            else
            {
                sum-=ch[i]-'0';
            }
        }
        return sum;
        
    }
}
