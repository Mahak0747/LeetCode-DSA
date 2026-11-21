class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        int a=0;
        int b=0;
        String[] ans=new String[n];
        for(int i=0; i<n; i++){
            boolean bob=(rain[i]==1);
            boolean alice=(rain[i]==1 && i<n-1 && rain[i+1]==1);
            if(!alice && !bob)ans[i]="None";
            else if(alice && !bob){
                ans[i]="Alice";
                a++;
            }
            else if(!alice && bob){
                ans[i]="Bob";
                b++;
            }
            else{
                if(a<=b){
                    ans[i]="Alice";
                    a++;
                }
                else{
                    ans[i]="Bob";
                    b++;
                }
            }
        }
        return ans;
    }
}