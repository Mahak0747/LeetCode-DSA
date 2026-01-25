class Solution {
    private boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        //prefix
        int p=num;
        while(p!=0){
            if(!isPrime(p))return false;
            p/=10;
        }
        //suffix
        int s=num;
        int i=0;
        while(s!=0){
            int rem = num % (int)Math.pow(10, i + 1);
            if(!isPrime(rem))return false;
            i++;
            s/=10;
        }
        return true;
    }
}