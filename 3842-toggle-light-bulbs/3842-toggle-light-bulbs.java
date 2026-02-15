class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<bulbs.size(); i++){
            if(set.contains(bulbs.get(i)))set.remove(bulbs.get(i));
            else set.add(bulbs.get(i));
        }
        if(set.size()==0)return new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for (int num : set)l.add(num);
        Collections.sort(l);
        return l;
    }
}