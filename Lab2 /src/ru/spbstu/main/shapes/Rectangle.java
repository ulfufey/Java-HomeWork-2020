package ru.spbstu.main.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
	private float height;
	private float width;
	private int angle = 0;
	private StructurePoint startPosition;
	
	public Rectangle(float height, float width, StructurePoint point) {
		this.height = height;
		this.width = width;
		startPosition = point;
	}
	
	@Override
	public float getArea() {
		return height * width;
	}
	
	@Override
	public float getPerimeter() {
		return 2 * (height + width);
	}
	
	@Override
	public int getRotation() {
		return angle;
	}
	public StructurePoint getStartPosition() {
		return (this.startPosition);
	}
	
	
	@Override
	public String toString() {
		return ("height : " + this.height + "width :" + this.width + "Start Position(X : " + this.startPosition.x + ", Y :" +
	                       + this.startPosition.y);
	}
}
