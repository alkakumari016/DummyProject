package com.cts.auto;

public class Line {
	private Point a;
	private Point b;
	
	public Line() {
	}
	public Line(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public void drawLine(){
		System.out.println("("+a.getX()+","+a.getY()+")........................"+"("+b.getX()+","+b.getY()+")");
	}
	

}
