class Solution {
    static String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set=new HashSet<>();
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                sb.append(code[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}