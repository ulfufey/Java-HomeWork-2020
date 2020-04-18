package ru.spbstu.main.shapes;

public class StructurePoint implements Point {
	protected float x;
	protected float y;
	public StructurePoint(float x, float y) {
		this.x = x;
		this.y = y;
		}
		
	@Override
	public float getX() {
		return this.x;
	}
	
	@Override
	public float getY() {
		return this.y;
	}
}
	

