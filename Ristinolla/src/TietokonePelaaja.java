import java.util.Random;

public class TietokonePelaaja extends Pelaaja{
	
	@Override
	/**
	 * Valitsee randomisti numeron 1-9 v�lilt�.
	 */
	int pelattavaRuutu() {
	
		Random r = new Random();
		
		int ruutu = r.nextInt(10);
	
		return ruutu;
	}	
}
