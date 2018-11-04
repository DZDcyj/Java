public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
    @Override
    public double getArea() {

        int width = this.width;
        int height=this.height;
        return width*height; // to be replaced
    }
}
