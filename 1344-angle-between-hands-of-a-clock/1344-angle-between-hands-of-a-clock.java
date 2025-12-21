class Solution {
    public double angleClock(int hour, int minutes) {
        double h_degree=30;
        double min_degree=6;
        double hour_deg=((minutes*h_degree)/60)+(hour%12)*h_degree;
        double minute_deg=minutes*min_degree;
        double diff=Math.abs(minute_deg-hour_deg);
        return Math.min(diff,360-diff);
    }
}