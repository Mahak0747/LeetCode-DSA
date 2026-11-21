class Solution {
    private static String left(String[] words, int diff, int i, int j){
        int spaces=diff-(j-i-1);
        StringBuilder sb=new StringBuilder(words[i]);
        for(int k=i+1; k<j; k++){
            sb.append(" "+words[k]);
        }
        sb.append(" ".repeat(spaces));
        return sb.toString();
    }
    private static String middle(String[] words, int diff, int i, int j){
        int spaces=j-i-1;
        int spaceslot=diff/spaces;
        int extra=diff%spaces;
        StringBuilder sb=new StringBuilder(words[i]);
        for(int k=i+1; k<j; k++){
            int applyspace=spaceslot+(extra-->0?1:0);
            sb.append(" ".repeat(applyspace)+words[k]);
        }
        return sb.toString();
    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> arr=new ArrayList<>();
        int i=0;
        int n=words.length;
        while(i<n){
            int j=i+1;
            int currlength=words[i].length();
            while(j<n && (currlength+words[j].length()+(j-i-1)<maxWidth)){
                currlength+=words[j].length();
                j++;
            }
            int diff=maxWidth-currlength;
            int w=j-i;
            if(w==1 || j>=n)arr.add(left(words,diff,i,j));
            else arr.add(middle(words,diff,i,j));
            i=j;
        }
        return arr;
    }
}