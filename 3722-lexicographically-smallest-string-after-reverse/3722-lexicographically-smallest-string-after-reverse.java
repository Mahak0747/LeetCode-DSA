class Solution {
    public String lexSmallest(String s) {
        String str=s;
        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder();
            sb.append(new StringBuilder(s.substring(0, i + 1)).reverse());
            sb.append(s.substring(i + 1));
            String temp = sb.toString();
            if (temp.compareTo(str) < 0)str = temp;
        }
        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(0,i));
            sb.append(new StringBuilder(s.substring(i)).reverse());
            String temp = sb.toString();
            if (temp.compareTo(str) < 0)str = temp;
        }
        return str;
    }
}