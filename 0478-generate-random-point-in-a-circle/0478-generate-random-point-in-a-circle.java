class Solution {
    double radius,x_center,y_center;
    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center=x_center;
        this.y_center=y_center;
    }
    
    public double[] randPoint() {
        double r = radius*Math.sqrt(Math.random());
        double th = Math.random()*2*Math.PI;
        // double x = Math.random()*((x_center+radius)-(x_center-radius))+(x_center-radius);
        // double y = Math.random()*((y_center+radius)-(y_center-radius))+(y_center-radius);
        // // double[] ans= new double[]{}
        return new double[]{x_center+r*Math.cos(th),y_center+r*Math.sin(th)};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */