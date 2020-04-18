package ru.spbstu.main.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape,Point,Ellipse {
	private float radius;
	private StructurePoint position;
	
	public Circle(float radius, StructurePoint position) {
		this.radius = radius;
		this.position = position;
	}
	
	@Override
	public float getArea() {
		return (float)(Math.PI * Math.pow(this.radius, 2));
	}
	
	@Override
	public float getX() {
		return this.position.x;
	}
	
	@Override
	public float getY() {
		return this.position.y;
	}
	
	@Override
	public float getLength() {
		return (float)(Math.PI * (radius * 2));
	}
	
	@Override
	public String toString() {
		return "Radius : " + this.radius + "Central position(X : " + this.position.x + ", Y :" + this.position.y;
	}
}
