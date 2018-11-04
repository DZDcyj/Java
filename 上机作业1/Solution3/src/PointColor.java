public class PointColor extends PointGrey {
    protected int red;
    protected int green;
    protected int blue;
    public PointColor(int x, int y, int red, int green, int blue) {
        super(x, y,0);
        greyscale = (red + green + blue) / 3;
    }
    @Override
    public double getDistance(Point p) {
        double distance = Math.sqrt(Math.pow((double) (p.px - this.px), 2) + Math.pow((double) (p.py - this.py), 2));
        return distance;
    }
    @Override
    public int grayscaleDiff(Point p) {
        int diff;
        diff = Math.abs(this.greyscale -((PointGrey)p).greyscale);
        return diff;
    }
}
