class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        //xNearest=x, yNearest=y
        int x=Math.max(x1,Math.min(xCenter,x2));
        int y=Math.max(y1,Math.min(yCenter,y2));
        int dis=(int)Math.pow((x-xCenter),2)+(int)Math.pow((y-yCenter),2);
        if(dis<=radius*radius) return true;
        return false;
    }
}