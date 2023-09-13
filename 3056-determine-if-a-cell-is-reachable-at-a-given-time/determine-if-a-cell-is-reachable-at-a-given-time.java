class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xdiff=Math.abs(sx-fx);
        int ydiff=Math.abs(sy-fy);
        int mindist=Math.min(xdiff,ydiff);
        xdiff-=mindist;
        ydiff-=mindist;
        mindist+=xdiff+ydiff;
        if(mindist==0){
            return t!=1;
        }
        return (mindist<=t);
    }
}