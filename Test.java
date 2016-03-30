import java.awt.Rectangle;

public class Test {
	public static void main(String[] args) throws IllegalMoveException {
		Rectangle r = new Rectangle(0, 0, 10, 10);
		Point p = new BoundedPoint(5, 5, r);

		try {
			p.moveTo(20, 20);
		} catch (IllegalMoveException e) {
			System.out.println("Point " + e.point() + " cannot go to "
					+ e.destination());
		}
	}
}
