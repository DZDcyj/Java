public  class Circle extends Shape{
    private int range;
    public Circle(int r){
        this.range=r;
    }
    public double getArea() {
        double pi=3.14;
        int range = this.range;
        return range*range*pi; // to be replaced
    }
}