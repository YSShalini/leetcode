class Solution {
    public boolean detectCapitalUse(String word) {
        char ch=word.charAt(0);
        if(word.equals(word.toUpperCase())||word.equals(word.toLowerCase())){
            return true;
        }
        String o=word.toLowerCase();
        o=Character.toUpperCase(o.charAt(0))+o.substring(1);
        if(word.equals(o))
        {return true;}
        
        return false;
    }
}
