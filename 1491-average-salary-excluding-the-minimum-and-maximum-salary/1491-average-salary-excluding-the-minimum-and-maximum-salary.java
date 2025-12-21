class Solution {
    public double average(int[] salary) {
        double max = salary[0];
        double min = salary[0];
        double sum = 0;
        for(int i = 0; i < salary.length; i++) {
            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }
        double adjustedSum = sum - max - min;
        return adjustedSum / (salary.length - 2);
    }
}
