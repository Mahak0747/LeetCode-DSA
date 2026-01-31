class Solution {
    private boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
    }
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        int l=0; 
        int u=arr.length-1;
        while(l<u){
            while(!isLower(arr[l])&&l<u)l++;
            while(!isLower(arr[u])&&l<u)u--;
            char temp=arr[l];
            arr[l]=arr[u];
            arr[u]=temp;
            l++;
            u--;
        }
        l=0; 
        u=arr.length-1;
        while(l<u){
            while(isLower(arr[l])&&l<u)l++;
            while(isLower(arr[u])&&l<u)u--;
            char temp=arr[l];
            arr[l]=arr[u];
            arr[u]=temp;
            l++;
            u--;
        }    
        return new String(arr);
    }
}