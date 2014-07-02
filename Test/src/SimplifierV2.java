import java.util.ArrayList;

public class SimplifierV2 {
	private float x, y;
	private int[] nbPrime = { 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2 };
	private int i = nbPrime.length - 1;
	private boolean isSimplified = false; // It would certainly be removed
											// after;
	private ArrayList<Integer> test = new ArrayList<Integer>();
	private int xFinal, yFinal;

	// x = numerateur && y = denominateur
	public SimplifierV2(float x, float y) {
		this.x = x;
		this.y = y;
		float xTemp, yTemp;

		System.out.println(this.x + " - " + this.y);
		while (!isSimplified) {
			for (int i = 0; i <= this.i; i++) {
				xTemp = this.x / nbPrime[i];
				yTemp = this.y / nbPrime[i];
				System.out.println("i=" + i + "  |  nbPrime : " + nbPrime[i] + "  |  x Temp : " + xTemp + "  |  y temp : " + yTemp);
				if (xTemp == (int) xTemp && yTemp == (int) yTemp) {
					test.add(i);
					this.i = i;
					this.xFinal = (int) xTemp;
					this.yFinal = (int) yTemp;
					break;
				}
				
			}
			isSimplified = true;
		}

		Object[] testToArray = test.toArray();
		for (int i = 0; i < testToArray.length; i++) {
			System.out.println("i = " + testToArray[i] + " - nbPrime =" + nbPrime[(int) testToArray[i]]);
		}
		
		
		System.out.println("X final = " + this.xFinal + " | Y final = " + this.yFinal);
	}

}
