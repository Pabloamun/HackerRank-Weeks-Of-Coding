package weekOfCoding29;

import java.util.Scanner;

class Point {
	double i;
	double j;

	Point(double i, double j) {
		this.i = i;
		this.j = j;
	}

}

class Circle {
	Point center;
	double r;

	Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}

	static Circle read(double i, double j, double r) {
		return new Circle(new Point(i, j), r);
	}

	boolean contains(int i, int j) {
		double di = i - center.i;
		double dj = j - center.j;
		return di * di + dj * dj <= r * r;
	}
}

class Triangle {
	Point p1;
	Point p2;
	Point p3;

	Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	boolean contains(Point p) {
		return new Triangle(p1, p2, p3).area() == new Triangle(p1, p2, p)
				.area()
				+ new Triangle(p2, p3, p).area()
				+ new Triangle(p3, p1, p).area();
	}

	double area() {
		return Math.abs((p3.i - p1.i) * (p2.j - p1.j) - (p3.j - p1.j)
				* (p2.i - p1.i)) / 2;
	}
}

class Square {
	Point p1;
	Point p2;
	Point p3;
	Point p4;

	Square(Point p1, Point p2, Point p3, Point p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	static Square read(double i1, double j1, double i3, double j3) {
		double ci = (i1 + i3) / 2.0;
		double cj = (j1 + j3) / 2.0;
		double di = i1 - ci;
		double dj = j1 - cj;
		double pi = -dj;
		double pj = di;
		double i2 = ci + pi;
		double j2 = cj + pj;
		double i4 = ci - pi;
		double j4 = cj - pj;
		return new Square(new Point(i1, j1), new Point(i2, j2), new Point(i3,
				j3), new Point(i4, j4));
	}

	boolean contains(int i, int j) {
		return new Triangle(p1, p3, p2).contains(new Point(i, j))
				|| new Triangle(p1, p3, p4).contains(new Point(i, j));
	}
};

public class CircleAndSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		double circleX = in.nextInt();
		double circleY = in.nextInt();
		double r = in.nextInt();
		double x1 = in.nextInt();
		double y1 = in.nextInt();
		double x3 = in.nextInt();
		double y3 = in.nextInt();
		Circle circle = Circle.read(circleY, circleX, r);
		Square square = Square.read(y1, x1, y3, x3);
		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++) {
				if (circle.contains(i, j) || square.contains(i, j)) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}
		in.close();
	}
}
