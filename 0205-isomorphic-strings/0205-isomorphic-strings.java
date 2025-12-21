class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> rev = new HashMap<>(); 

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b) return false;
            } else {
                map.put(a, b);
            }
            
            if(rev.containsKey(b)){
                if(rev.get(b) != a) return false;
            } else {
                rev.put(b, a);
            }
        }
        return true;
    }
}
