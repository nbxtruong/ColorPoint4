public interface Point {

	public void moveTo(int x, int y) throws IllegalMoveException;

	public int getX();

	public int getY();
}