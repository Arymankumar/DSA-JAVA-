class Solution {
    public String intToRoman(int num) {
        int []values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
         String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<values.length && num>0;i++){
            int val=values[i];
            int count=num/val;
            for(int k=0;k<count;k++){
                res.append(symbols[i]);
            }
            num=num-count*val;
        }
        return res.toString();
    }
}