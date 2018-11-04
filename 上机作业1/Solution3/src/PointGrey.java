
public class PointGrey extends Point {
    protected int greyscale; // [0, 255] from black to white

    public PointGrey(int x, int y, int grey) {
        super(x, y);
        greyscale = grey;
    }

    // TODO: add a constructor for PointGrey

    @Override
    public double getDistance(Point p) {
        // TODO: fill this function up
        double distance = Math.sqrt(Math.pow((double) (p.px - this.px), 2) + Math.pow((double) (p.py - this.py), 2));
        return distance; // to be replaced
    }
    @Override
    public int grayscaleDiff(Point p) {
        // TODO: fill this function up
        int diff;
        diff = Math.abs(this.greyscale - (((PointGrey) p).greyscale));
        return diff; // to be replaced
    }
}
