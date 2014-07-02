import java.util.ArrayList;

public class SimplifierV2 {
	private float x, y;
	private int[] nbPrime = { 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2 };
	private int i = nbPrime.length - 1;
	private int xFinal, yFinal, intFinal;

	// x = numerateur && y = denominateur
	public SimplifierV2(float x, float y) {
		this.x = x;
		this.y = y;
		float xTemp, yTemp;

		if (canBeDivided()) {
			intFinal = (int) (this.x / this.y);
			return;
		}

		System.out.println(this.x + " - " + this.y);
		for (int i = 0; i <= this.i; i++) {
			xTemp = this.x / nbPrime[i];
			yTemp = this.y / nbPrime[i];
			System.out.println("i=" + i + "  |  nbPrime : " + nbPrime[i] + "  |  x Temp : " + xTemp + "  |  y temp : " + yTemp);
			if (xTemp == (int) xTemp && yTemp == (int) yTemp) {
				this.i = i;
				this.xFinal = (int) xTemp;
				this.yFinal = (int) yTemp;
				break;
			}

		}
	}

	private boolean canBeDivided() {
		float test = this.x / this.y;
		if (test == (int) test)
			return true;
		else
			return false;
	}

	public String getFinal() {
		return (xFinal + " - " + yFinal + " - " + intFinal);
	}

	public String getReponse() {
		if (intFinal == 0)
			return (xFinal + " - " + yFinal);
		else
			return intFinal + "";
	}
}
