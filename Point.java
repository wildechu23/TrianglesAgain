public class Point {
  private double x,y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    return Math.sqrt(
      Math.pow((this.x - other.x), 2) +
      Math.pow((this.y - other.y), 2));
  }
  
  public boolean equals(Point other) {
    return (this.x == other.x) && (this.y == other.y);
  }
}