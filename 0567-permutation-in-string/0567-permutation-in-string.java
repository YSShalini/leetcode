class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){return false;}
        int[] s1a=new int[26];
        int[] s2a=new int[26];

        for(int c=0;c<s1.length();c++){
            s1a[s1.charAt(c)-'a']++;
            s2a[s2.charAt(c)-'a']++;
        }
       if( Arrays.equals(s1a,s2a)){return true;}
        int l=0,r=s1.length();
        while(r<s2.length()){
                s2a[s2.charAt(l)-'a']--;
                s2a[s2.charAt(r)-'a']++;
                if(Arrays.equals(s1a,s2a)){return true;}
                l++;r++;
        }
        return false;
    }
}