class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String tar = licensePlate.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : tar.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        String res = "";
        for (String x : words) {
            x = x.toLowerCase();
            boolean b = true;
            for (char ch : map.keySet()) {
                int count = 0;
                for (char c : x.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }
                if (count < map.get(ch)) {
                    b = false;
                    break;
                }
            }
            if (b && (res.equals("") || x.length() < res.length())) {
                res = x;
            }
        }
        return res;
    }
}