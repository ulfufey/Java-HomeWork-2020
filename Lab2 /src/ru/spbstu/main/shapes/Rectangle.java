package ru.spbstu.main.shapes;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

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
	private int angle;
	private StructurePoint startPosition;
	
	public Rectangle(float height, float width, StructurePoint point) {
		if ((height < 0) || (width < 0)) {
			try {
				throw new IllegalArgumentException("Не правильно выбраны параметры");
			} catch (IllegalArgumentException e) {
				Logger.getLogger(Rectangle.class.getName()).log(new LogRecord(Level.WARNING, e.getMessage()));
				System.exit(1);
			}
		}
		this.height = height;
		this.width = width;
		this.startPosition = point;
		this.angle = 0;
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
