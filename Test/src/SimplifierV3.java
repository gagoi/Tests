public class SimplifierV3 {
	private int divCommon;
	public SimplifierV3(float x, float y) {
		float min = Math.min(x, y);
		float test = x/y, testX, testY;
		if(test == (int) test) {
			System.out.println("On peut diviser, donc la fraction vaut : " + test);
			return;
		}
		for (int i = (int) min + 1; i > 1; i--) {
			testX = x / i;
			testY = y / i;
			System.out.println(i + " - " + testX + " - " + testY);
			if(testX == (int) testX && testY == (int) testY) {
				this.divCommon = i;
				return;
			}
		}
	}

	public int getDivCommon(){
		return this.divCommon;
	}
}
