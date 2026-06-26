class Solution {
    public int maxDistance(String moves) {
        int r=0,l=0,u=0,d=0,wildcards=0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='U') u++;
            if(ch=='L') l++;
            if(ch=='D') d++;
            if(ch=='R') r++;
            if(ch=='_') wildcards++;
        }
        return Math.abs(l-r) + Math.abs(u-d) + wildcards;
    }
}