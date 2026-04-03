class Solution {
    public int minimumCost(int m, int n, int[] harr, int[] varr) {
        Arrays.sort(harr);
        Arrays.sort(varr);
        int v=varr.length-1;
        int h=harr.length-1;

        int vp=1;
        int hp=1;
        int c=0;
        while(v>=0&&h>=0){
            if(varr[v]<=harr[h]){
                c+=vp*harr[h];
                hp++;
                h--;
            }
            else{
                c+=hp*varr[v];
                vp++;
                v--;
            }
        }
        while(h>=0){
            c+=vp*harr[h];
            hp++;
            h--;
        }
        while(v>=0){
            c+=hp*varr[v];
            vp++;
            v--;
        }
        return c;
    }
}