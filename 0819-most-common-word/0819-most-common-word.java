class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        String[] arr = paragraph.trim().split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String ban : banned){
            set.add(ban.toLowerCase());
        }
        int max = 0;
        String key = "";
        for(String word : arr){
            if(!set.contains(word)){
                map.put(word, map.getOrDefault(word,0) + 1);
                if(map.get(word) > max){ max = map.get(word); key = word; }
            }
        }
        return key;
    }
}