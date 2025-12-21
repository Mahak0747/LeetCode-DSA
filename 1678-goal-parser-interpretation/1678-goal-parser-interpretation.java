class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder(""); 
        for(int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G') {
                s.append('G');
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                i++;
                s.append('o');
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
                i += 3;
                s.append("al");
            }
        }
        return s.toString(); 
    }
}
