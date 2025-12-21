class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s=new StringBuilder("");
        for(int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                s.append("[.]");
            } else {
                s.append(ch);
            }
        }        
        return s.toString();
    }
}