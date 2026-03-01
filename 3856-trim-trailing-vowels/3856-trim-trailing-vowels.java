class Solution {
    public String trimTrailingVowels(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int i=s.length()-1;
        while(i>=0&&set.contains(s.charAt(i))){
            i--;
        }
        return s.substring(0,i+1);
    }
}