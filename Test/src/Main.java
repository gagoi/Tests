import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			// Simplifier s = new Simplifier(100, 10);
			System.out.println("------------------------------");
			// SimplifierV2 s2 = new SimplifierV2(250, 1250);
			// System.out.println(s2.getReponse());
			Scanner sc = new Scanner(System.in);
			double x, y;
			System.out.print("Entrez le numérateur : ");
			x = sc.nextDouble();
			System.out.print("Entrez le dénominateur : ");
			y = sc.nextDouble();

			SimplifierV3 s3 = new SimplifierV3(x, y);
			System.out.println("Diviseur commun = " + s3.getCommonDiv());
		}
	}
}