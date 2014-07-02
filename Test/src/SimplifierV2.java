public class SimplifierV2 {
	private float x, y;
	private int xInt, yInt;
	private int[] nbPrime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
	private boolean isSimplified  = false; // It would certainly be remove after;

	// x = numerateur && y = denominateur
	public SimplifierV2(float x, float y) {
		this.x = x;
		this.y = y;
		this.xInt = (int) x;
		this.yInt = (int) y;
	}

}
