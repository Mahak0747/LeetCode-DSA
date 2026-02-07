class Solution {
    public int minimumDeletions(String s) {
        int b=0;
        int remove=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='b')b++;
            else remove=Math.min(remove+1,b);
        }
        return remove;
    }
}