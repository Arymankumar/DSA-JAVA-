class Solution {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Character>> ch=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ch.add(new ArrayList<>());
        }
        int len=0;
        while(len<s.length()){
            for(int i=0;i<numRows && len<s.length();i++){
                ch.get(i).add(s.charAt(len++));
            }
            for(int i=numRows-2;i>0 && len<s.length();i--){
                ch.get(i).add(s.charAt(len++));
            }
        }
        StringBuilder sn=new StringBuilder();
        for(int i=0;i<ch.size();i++){
            for(char c:ch.get(i)){
                sn.append(c);
            }
        }
        return sn.toString();
    }
}