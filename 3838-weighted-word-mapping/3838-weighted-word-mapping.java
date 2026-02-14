class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<words.length; i++){
            String str=words[i];
            int val=0;
            for(char ch:str.toCharArray()){
                val+=weights[ch-'a'];
            }
            val%=26;
            sb.append((char)('a' + (25 - val)));
        }
        return sb.toString();
    }
}