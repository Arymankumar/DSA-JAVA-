class Solution {
    public void nextPermutation(int[] arr) {
        int pivot =-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        for(int i=arr.length-1;pivot !=-1 && i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        int start=pivot+1;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}