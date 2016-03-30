

public class IllegalMoveException extends Exception {
	private Point point;
	private Point destination;

	public IllegalMoveException(Point p, int x, int y) {
		super("Point " + p + " is not allowed to move in (" + x + "," + y + ")");
		destination = new PointImpl(x,y);
		point = p;
	}

	public Point destination() {
		return destination;
	}

	public Point point() {
		return point;
	}
}
