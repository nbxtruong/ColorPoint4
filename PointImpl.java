public class PointImpl implements Point {
	private int x;
	private int y;

	public PointImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveTo(int x, int y) throws IllegalMoveException {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean equals(Object o) {
		if (!(o instanceof PointImpl))
			return false;
		PointImpl p = (PointImpl) o;
		return p.x == x && p.y == y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
