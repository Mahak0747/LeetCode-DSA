class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            if(!words[i].isEmpty()){
                stack.push(words[i]);
            }
        }
        StringBuilder str=new StringBuilder("");
        while(!stack.isEmpty()){
            str.append(stack.pop());
            if(!stack.isEmpty()){
                str.append(" ");
            }
        }
        return str.toString();
    }
}
