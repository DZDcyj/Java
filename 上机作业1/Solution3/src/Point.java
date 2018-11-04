
public abstract class Point {
    protected int px; // position in x
    protected int py; // position in y
    public Point (int x,int y){
        px=x;
        py=y;
    }
    /*
     * Return the euclidean distance between this point
     * and another point p
     * @param p another point
     * @return the euclidean distance
     */
    public abstract double getDistance(Point p);

    /*
     * Return the difference in grayscale between this point
     * and another point p
     * @param p another point
     * @return the grayscale difference
     */
    public abstract int grayscaleDiff(Point p);

}
