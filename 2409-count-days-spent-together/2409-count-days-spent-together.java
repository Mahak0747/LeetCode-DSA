class Solution {
    private static int cal(String str,int[] arr){
        int m=Integer.parseInt(str.substring(0,2));
        int d=Integer.parseInt(str.substring(3));
        return arr[m-1]+d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] datesOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] ps=new int[13];
        for(int i=0; i<12; i++){
            ps[i+1]=ps[i]+datesOfMonths[i];
        }
        int aa=cal(arriveAlice,ps);
        int la=cal(leaveAlice,ps);
        int ab=cal(arriveBob,ps);
        int lb=cal(leaveBob,ps);
        return Math.max(0,Math.min(la,lb)-Math.max(aa,ab)+1);
    }
}