class Solution {
    static List<String> ans;
    private static void permutations(StringBuilder sb,int open ,int close, int n){
        if(sb.length()==n*2){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            permutations(sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            permutations(sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        permutations(new StringBuilder(),0,0,n);
        return ans;
    }
}