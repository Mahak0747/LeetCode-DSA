class Solution {
    public int[] intersection(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>(); 
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if (!list.contains(a[i])) {  
                    list.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr=new int[list.size()];
        for(int k=0; k<list.size(); k++){
            arr[k]=list.get(k);
        }
        return arr;
    }
}