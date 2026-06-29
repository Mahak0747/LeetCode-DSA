class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int l=0;
        int r=0;
        int start=-1;
        int min=Integer.MAX_VALUE;
        int c=t.length();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch)) {
                if(map.get(ch) > 0) {
                    c--;
                }
                map.put(ch, map.get(ch)-1);
            }
            while(c == 0){
                if(r-l+1<min){
                    min=r-l+1;
                    start=l;
                }
                char left = s.charAt(l);
                if(map.containsKey(left)) {
                    map.put(left, map.get(left)+1);
                    if(map.get(left) > 0) {
                        c++;
                    }
                }
                l++;
            }
            r++;
        }
        return start == -1 ? "" : s.substring(start, start+min);
    }
}