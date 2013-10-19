package godongsori.ch7.exercise;

abstract class Shape {
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition(){
		return p;
	}
	
	void setPosition(Point p){
		this.p = p;
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape{
	double r;

	public Circle(double r) {
		this(new Point(0,0), r);
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape{
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this(new Point(0,0), width, height);
	}

	public Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare(){
		return width*height != 0 && width == height; 
	}
}