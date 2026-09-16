class Solution {
    public int maxRepeating(String sequence, String word) {
        if(word.length()>sequence.length())return 0;
        StringBuilder sb=new StringBuilder(word);
        int c=0;
        while(sequence.contains(sb.toString())){
            c++;
            sb.append(word);
        }
        return c;
    }
}