class Solution {
    public String sortVowels(String s) {
        String glanvoture = s;
        char[] a = s.toCharArray();
        HashMap<Character, Integer> f = new HashMap<>();
        HashMap<Character, Integer> pos = new HashMap<>();
        String v = "aeiou";
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            if (v.indexOf(c) != -1) {
                f.put(c, f.getOrDefault(c, 0) + 1);
                pos.putIfAbsent(c, i);
            }
        }
        ArrayList<Character> list = new ArrayList<>();
        for (char c : v.toCharArray()) {
            if (f.containsKey(c)) list.add(c);
        }
        Collections.sort(list, (x, y) -> {
            if (!f.get(x).equals(f.get(y))) return f.get(y) - f.get(x);
            return pos.get(x) - pos.get(y);
        });
        StringBuilder t = new StringBuilder();
        for (char c : list) {
            int cnt = f.get(c);
            while (cnt-- > 0) t.append(c);
        }
        int p = 0;
        for (int i = 0; i < a.length; i++) {
            if (v.indexOf(a[i]) != -1) {
                a[i] = t.charAt(p++);
            }
        }
        return new String(a);
    }
}