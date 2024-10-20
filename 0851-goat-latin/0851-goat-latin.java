class Solution {
    public String toGoatLatin(String sentence) {
        String[] s=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length;i++){
            StringBuilder goat=new StringBuilder();
            String word=s[i];
            if(word.startsWith("A")||word.startsWith("E")||word.startsWith("I")||word.startsWith("O")||word.startsWith("U")||word.startsWith("u")||
            word.startsWith("a")||word.startsWith("e")||word.startsWith("i")||word.startsWith("o")){
                goat.append(word).append("ma");
            }
            else{
                goat.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            goat.append("a".repeat(i+1));
            res.append(goat).append(" ");
        }
         return res.toString().trim();
        
    }
}