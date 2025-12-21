class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = left; i <= right; i++){
            int num = i;
            boolean isSD = true;            
            while (num > 0){
                int rem = num % 10;
                if (rem == 0 || i % rem != 0){
                    isSD = false;
                    break; 
                }
                num/=10;
            }            
            if (isSD){
                list.add(i);
            }
        }        
        return list;
    }
}