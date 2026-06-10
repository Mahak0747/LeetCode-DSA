class Pair{
    String str;
    int val;
    public Pair(String s,int v){
        this.str=s;
        this.val=v;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        int n=wordList.size();
        HashSet<String> set=new HashSet<>();
        for(String i:wordList)set.add(i);
        if(set.contains(beginWord))set.remove(beginWord);
        while(!q.isEmpty()){
            Pair p=q.remove();
            String curr=p.str;
            int wt=p.val;
            if(curr.equals(endWord))return wt;
            for(int i=0; i<curr.length(); i++){
                char[] arr = curr.toCharArray();
                for(char j='a'; j<='z'; j++){
                    arr[i] = j;
                    String nEw = new String(arr);
                    if(set.contains(nEw)){
                        set.remove(nEw);
                        q.add(new Pair(nEw,wt+1));
                    }
                }
            }
        }
        return 0;
    }
}