import java.util.Arrays;

public class Type {
	private String name;
	private int posX, posY;
	private boolean isEnabled;
	private int[] test = new int[32];

	public Type() {
		if (this.posX != 0) isEnabled = true;
		Arrays.fill(test, 1);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPos(int x, int y) {
		this.posX = x;
		this.posY = y;
	}

	public String getName() {
		return this.name;
	}

	public int[] getPos() {
		return new int[] { posX, posY };
	}

	public boolean isEnabled() {
		return this.isEnabled;
	}
	
	@Override
	public String toString(){
		return name + " - PosX = " + this.posX + " - PosY = " + this.posY;
	}
}
