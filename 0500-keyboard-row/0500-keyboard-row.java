class Solution {
    public String[] findWords(String[] words) {
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        ArrayList<String> list=new ArrayList<>();
        for (String str : words) {
            String word = str.toLowerCase();
            int val = -1;
            boolean ok = true;
            for(char ch:word.toCharArray()){
                if(str1.contains(ch+"")){
                    if (val == -1)val = 0;
                    else if (val != 0) {
                        ok = false;
                        break;
                    }
                }
                else if(str2.contains(ch+"")){
                    if (val == -1)val = 1;
                    else if (val != 1) {
                        ok = false;
                        break;
                    }
                }
                else {
                    if (val == -1)val = 2;
                    else if (val != 2) {
                        ok = false;
                        break;
                    }
                }
            }
            if(ok)list.add(str);
        }
        return list.toArray(new String[list.size()]);
    }
}