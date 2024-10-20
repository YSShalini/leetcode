class Solution {
    public String convert(String s, int numRows) {
        Character all[][]=new Character[numRows][s.length()];
        int row=0,col=0,cur=0;
        while(cur<s.length()){
            while(row<numRows&&cur<s.length()){
                all[row++][col]=s.charAt(cur++);
            }
            row=Math.max(0,row-2);
            while(row>0&&cur<s.length()){
                all[row--][++col]=s.charAt(cur++);
            }
            col++;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(all[i][j]!=null){
                    ans.append(all[i][j]);
                }
              
            }
        }
        return ans.toString();
    }
}