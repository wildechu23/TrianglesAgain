public class Tester {
  public static void main(String[] args) {
    Point A = new Point(0,0);
    Point B = new Point(1,1);
    Point C = new Point(1,0);
    Point D = new Point(2,0);
    Point E = new Point(3,4);
    Point F = new Point(0.5, Math.sqrt(3)/2);
    Point G = new Point(10, 100);

    Triangle a = new Triangle(A, B, D);
    Triangle b = new Triangle(A, C, E);
    Triangle c = new Triangle(A, C, F);

    System.out.println(A.distanceTo(B)); // sqrt 2 is about 1.414
    System.out.println(A.distanceTo(C)); // 1

    System.out.println(a.classify()); // isoceles
    System.out.println(b.classify()); // scalene
    System.out.println(c.classify()); // equilateral

    System.out.println(c.getPerimeter()); // 3

    System.out.println(a.getArea()); // 1

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    c.setVertex(2, G);

    System.out.println(c);
  }
}
