public class SimplifierV3 {
	private double x, y;
	private int commonDiv = 1;

	public SimplifierV3(double x, double y) {
		toFraction(x, y);
		double min = Math.min(x, y);
		double test = x / y, testX, testY;
		if (test == (int) test) {
			System.out.println("On peut diviser, donc la fraction vaut : " + test);
			return;
		}
		for (int i = (int) min + 1; i > 1; i--) {
			testX = x / i;
			testY = y / i;
			System.out.println(i + " - " + testX + " - " + testY);
			if (testX == (int) testX && testY == (int) testY) {
				this.commonDiv = i;
				return;
			}
		}
	}

	public void toFraction(double x, double y) {
		this.x = x;
		this.y = y;
		while (this.x == (int) this.x && this.y == (int) this.y) {
			this.x *= 10;
			this.y *= 10;
		}
	}

	public int getCommonDiv() {
		return this.commonDiv;
	}
}
