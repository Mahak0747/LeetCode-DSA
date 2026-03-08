class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        for(String s:nums)set.add(s);
        StringBuilder sb=new StringBuilder();
        int n=nums.length;
        for(int i=0; i<n; i++)sb.append('0');
        if(!set.contains(sb.toString()))return sb.toString();
        for(int i=0; i<n; i++){
            sb.setCharAt(i,'1');
            if(!set.contains(sb.toString()))return sb.toString();
        }
        return sb.toString();
    }
}