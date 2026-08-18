class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int li=Integer.MAX_VALUE;
        ArrayList<String> a=new ArrayList<>();
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(i+j<li){
                        a.clear();
                        a.add(list1[i]);
                        li=i+j;
                    }
                    else if(i+j==li)a.add(list1[i]);
                }
            }
        }
        return a.toArray(new String[0]);
    }
}