class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double [] distance = new double[points.length];
        int [][] output = new int[k][2];

        for(int i=0; i<points.length; i++)
            distance[i]  = Math.pow(points[i][0],2) + Math.pow(points[i][1],2);
        
        Arrays.sort(distance);
        double kth = distance[k-1];
        double dist=0; int index=k;

        for(int i=0; i<points.length; i++){
            dist = Math.pow(points[i][0],2) + Math.pow(points[i][1],2);
            if(dist <= kth){
                output[k-index] = points[i];
                index--;
            }
        }
        return output;
        
    }
}