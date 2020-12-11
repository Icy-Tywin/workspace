package com.app.geometry;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		this.x =x;
		this.y = y;
	}
	public String getPoint() {
		return "Point("+x+", "+y+")";
	}
	public boolean isEqual(Point2D anotherPoint) {
		return (x==anotherPoint.getX() && y==anotherPoint.getY());
	}
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public Point2D createOffsetPoint(int offsetX, int offsetY) {
		return (new Point2D(x + offsetX, y + offsetY));
	}
	public double calcDistance(Point2D anotherPoint) {
		return Math.sqrt(Math.pow((x-anotherPoint.getX()), 2)+Math.pow((y-anotherPoint.getY()),2));
	}
	
}
