class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int l=0;
        int maxlen=0;
        int maxfreq=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            freq[c-'A']++;
            maxfreq=Math.max(maxfreq,freq[c-'A']);
             while ((r - l + 1) - maxfreq > k) {
                 freq[s.charAt(l) - 'A']--;
                   l++;               

             }
             maxlen = Math.max(maxlen, r - l + 1);
          
        }
        return maxlen;
        
    }
}
