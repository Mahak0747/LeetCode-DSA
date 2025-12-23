class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        String[] words = text.split(" ");
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String word : words) {
            int len = word.length();
            map.putIfAbsent(len, new ArrayList<>());
            map.get(len).add(word);
        }
        List<Integer> lengths = new ArrayList<>(map.keySet());
        Collections.sort(lengths);
        StringBuilder sb = new StringBuilder();
        for (int len : lengths) {
            for (String w : map.get(len)) {
                sb.append(w).append(" ");
            }
        }
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString().trim();
    }
}