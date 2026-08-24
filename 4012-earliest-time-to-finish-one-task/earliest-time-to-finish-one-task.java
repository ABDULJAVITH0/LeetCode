class Solution {
    public int earliestTime(int[][] tasks) {
        int MinTime=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int finishtime=tasks[i][0]+tasks[i][1];
            MinTime=Math.min(MinTime,finishtime);
        }
        return MinTime;
    }
}