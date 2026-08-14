class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0; r<s.length(); r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);   
            while(map.get(ch)>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}