class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
                continue;
            }
            else if(i%3==0){
                arr.add("Fizz");
                continue;
            }
            else if(i%5==0){
                arr.add("Buzz");
                continue;
            }
            arr.add(Integer.toString(i));
        }
        return arr;
    }
}