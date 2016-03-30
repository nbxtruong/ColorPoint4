import java.awt.Rectangle;

public class BoundedPoint implements Point {
	private Rectangle bounds;
	private Point point;

	public BoundedPoint(int x, int y, Rectangle r) {
		if (!r.contains(x, y))
			throw new IllegalArgumentException("Point out of bounds");
		point = new PointImpl(x, y);
		this.bounds = new Rectangle(r);
	}

	public void moveTo(int x, int y) throws IllegalMoveException {
		if (!bounds.contains(x, y))
			throw new IllegalMoveException(this, x, y);
		point.moveTo(x, y);
	}

	public int getX() {
		return point.getX();
	}

	public int getY() {
		return point.getY();
	}

	public boolean equals(Object o) {
		if (!(o instanceof BoundedPoint))
			return false;
		BoundedPoint bp = (BoundedPoint) o;
		return bp.point.equals(point) && bp.bounds.equals(bounds);
	}

	public String toString() {
		return point.toString() + " Bounds : " + bounds;
	}
}