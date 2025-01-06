class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int target_ascii=target-'a';
        int left=0,right=letters.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(letters[mid]-'a'<=target_ascii){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return (letters[left]-'a'>target_ascii)?letters[left]:letters[0];
       
    }
}