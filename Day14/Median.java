package Day14;

  
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double b;

        //<!-- Creating an Array with size of num1+num2 -->
        int[] arr=new int[nums1.length+nums2.length];

//        <!-- Inserting values of num1 in new array -->
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }

        //<!-- Inserting values of num2 in new array -->
        for(int i=nums1.length,j=0;i<arr.length;i++,j++)
        {
            arr[i]=nums2[j];
        }
        Arrays.sort(arr);

        // <!-- If length of array is odd -->
        if(arr.length%2!=0)
        {
            b=(double)arr[(arr.length/2)];
        }
        // <!-- If length of array is even -->
        else
        {
            b=(arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        }
        return b;
    }
}
