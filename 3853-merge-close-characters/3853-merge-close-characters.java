class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        while(true){
            boolean add=false;
            for(int i=0; i<s.length(); i++){
                for (int j = i + 1; j < sb.length(); j++){
                    if (sb.charAt(i) == sb.charAt(j) && j - i <= k){
                        sb.deleteCharAt(j);
                        add=true;
                        break;
                    }
                }
                if(add)break;
            }
            if(!add)break;
        }
        return sb.toString();
    }
}