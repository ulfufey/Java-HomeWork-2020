package ru.spbstu.main.shapes;


import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
	private float firstSide;
	private float secondSide;
	private float thirdSide;
	private StructurePoint startPosition;
	private int angle = 0;
	
	public Triangle(float firstSide, float secondSide, float thirdSide, StructurePoint startPosition) {
		if ((firstSide + secondSide < thirdSide) || (firstSide + thirdSide < secondSide) || (secondSide + thirdSide < firstSide)) {
			try {
				throw new IllegalArgumentException("Неверно введены стороны треугольника");
			} catch (IllegalArgumentException e) {
				Logger.getLogger(Triangle.class.getName()).log(new LogRecord(Level.WARNING, e.getMessage()));
				System.exit(1);
			}
		}
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
		this.startPosition = startPosition;
	}
	
	@Override
	public float getArea() {
		float halfPerimeter = this.getPerimeter() / 2;
		return (float)(Math.sqrt(halfPerimeter * (halfPerimeter - this.firstSide) * (halfPerimeter - this.secondSide)
			                  * (halfPerimeter - this.thirdSide)));
	}
	
	@Override
	public float getPerimeter() {
		return (this.firstSide + this.secondSide + this.thirdSide);
	}
	
	@Override
	public int getRotation() {
		return this.angle;
	}
	
	public StructurePoint getStartPosition() {
		return (this.startPosition);
	}
	
	@Override
	public String toString() {
		return "First Side : " + this.firstSide + "Second Side : " + this.secondSide + "Third Side : " + this.thirdSide +
			       "Start position(X : " + this.startPosition.x + ", Y : " + this.startPosition.y;
	}
}
