class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[A.length];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<A.length; i++){
            set.add(A[i]);
            int c=0;
            for(int j=0; j<=i; j++){
                if(set.contains(B[j]))c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}