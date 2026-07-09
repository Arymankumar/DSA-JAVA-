class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] == 9){
                digits[i]=0;
            }else{
                digits[i]++;//[3,6] EXAMPLE
                return digits;
            }
        }
        digits=new int[digits.length+1];//[0,0,0,0]
        digits[0]=1; //[1,0,0,0,]
        return digits;
    }
}