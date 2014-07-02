public class Simplifier {
	private String fraction;
	private boolean isSimplified;
	private float numerateur, denominateur;

	public Simplifier(float numerateur, float denominateur) {
		int tableauPremier[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
		int premierUtilise = tableauPremier.length - 1;
		this.numerateur = numerateur;
		this.denominateur = denominateur;

		assert denominateur == 0 : "Division par 0";

		System.out.println("Numerateur = " + numerateur);
		System.out.println("Denominateur = " + denominateur);

		while (!isSimplified) {
			float tempNumerateur = this.numerateur / tableauPremier[premierUtilise], tempDenominateur = this.denominateur / tableauPremier[premierUtilise];
			boolean isNumerateurInteger = true, isDenominateurInteger = true;
			System.out.println(tableauPremier[premierUtilise]);
			System.out.println("Numerateur simplifie : " + tempNumerateur + " | En integer : " + (int) tempNumerateur);
			System.out.println("Denominateur simplifie : " + tempDenominateur + " | En integer : " + (int) tempDenominateur);
			if (tempNumerateur != (int) this.numerateur / tempNumerateur) isNumerateurInteger = false;
			if (tempDenominateur != (int) tempDenominateur) isDenominateurInteger = false;
			if (!isNumerateurInteger && !isDenominateurInteger)
				premierUtilise--;
			else {
				System.out.println("Premier utilise : " + tableauPremier[premierUtilise]);
				System.out.println("Numerateur de base : " + this.numerateur + ", apres simplification : " + tempNumerateur);
				System.out.println("Denominateur de base : " + this.denominateur + ", apres simplification : " + tempDenominateur);
			}
			if (premierUtilise < 0) isSimplified = true;
		}
	}

	public String getFraction() {
		return this.fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}
}