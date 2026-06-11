class Solution {
    static String b;
    static HashMap<String,Integer> map;
    static List<List<String>> ans;
    private static void dfs(ArrayList<String> path,String end){
        if(end.equals(b)){
            ArrayList<String> temp=new ArrayList<>(path);
            Collections.reverse(temp);
            ans.add(temp);
            return;
        }
        int steps=map.get(end);
        int len=end.length();
        for(int i=0; i<len; i++){
            for(char j='a'; j<='z'; j++){
                char[] string=end.toCharArray();
                string[i]=j;
                String nword=new String(string);
                if(map.containsKey(nword) && map.get(nword)+1==steps){
                    path.add(nword);
                    dfs(path,nword);
                    path.remove(path.size()-1);
                }
            }
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        b=beginWord;
        HashSet<String> set=new HashSet<>();
        for(String i:wordList)set.add(i);
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        map=new HashMap<>();
        map.put(beginWord,1);
        int len=beginWord.length();
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.remove();
            int level=map.get(word);
            if(word.equals(endWord))break;
            for(int i=0; i<len; i++){
                for(char j='a'; j<='z'; j++){
                    char[] string=word.toCharArray();
                    string[i]=j;
                    String nword=new String(string);
                    if(set.contains(nword)){
                        q.add(nword);
                        set.remove(nword);
                        map.put(nword,level+1);
                    }
                }
            }
        }
        ans=new ArrayList<>();
        if(map.containsKey(endWord)){
            ArrayList<String> path=new ArrayList<>();
            path.add(endWord);
            dfs(path,endWord);
        }
        return ans;
    }
}