class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int u=(int)Math.cbrt(n);
        int[] cubes=new int[u+1];
        for(int i=0; i<=u; i++){
            cubes[i]=i*i*i;;
        }
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0; i<=u; i++){
            for(int j=i; j<=u; j++){
                int sum = cubes[i] + cubes[j];
                if(sum<=n)c.put(sum, c.getOrDefault(sum, 0) + 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int key : c.keySet()) {
            if (c.get(key) >= 2) {
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}