class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01"); //no leading zero (always start with 1 and that is the only place to show the segment else if 1 start fronm any where will make the q false)
    }
}