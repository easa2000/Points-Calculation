public class Point {
    private int x;
    private int y;

    public double distance() {
        return Math.sqrt( ((this.x - 0) * (this.x - 0)) + ((this.y - 0) * ( this.y - 0)) );

    }

    public double distance(int x,int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

    }
    public double distance(Point z) {
        return Math.sqrt((this.x - z.x ) * (this.x - z.x) + (this.y - z.y) * (this .y - z.y));

    }
    public Point() {


    }
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    //setter x
    public void setX(int x) {
        this.x = x;
    }

    //setter y
    public void setY(int y) {
        this.y = y;
    }

    //getter x
    public int getX() {
        return x;
    }

    //getter y
    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance(second));
    }
}
