import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Pelilauta {

		private int[][] lauta = new int[3][3];
		
		private boolean asetettiinkoMerkki;
		
		private int[] tilanne = new int[2];
		
		/**
		 * Tulostaa pelilaudan numeroviittauksien kera
		 */
		public void esimerkkiLauta() {
			System.out.println("Laudan ruutujen numeroviittaukset ovat:");
			System.out.println("1 | 2 | 3");
			System.out.println("- + - + -");
			System.out.println("4 | 5 | 6");
			System.out.println("- + - + -");
			System.out.println("7 | 8 | 9");
			System.out.println("_________");
			System.out.println();
		}

		/**
		 * Tulostaa pelilaudan nykyisen tilanteen
		 */
		public void tulostaLauta() {
			
	        for(int i = 0; i < lauta.length; i++) {
	 				if(lauta[0][i] == 1 && i != 2) {
	 					System.out.print("X | ");
	 				}
	 				if(lauta[0][i] == 2 && i != 2) {
	 					System.out.print("O | ");
	 				}
	 				if(lauta[0][i] == 0 && i != 2) {
	 					System.out.print("  | ");
	 				}
	 				if(i == 2 && lauta[0][i] == 1) {
	 					System.out.println("X");
	 				}
	 				if(i == 2 && lauta[0][i] == 2) {
	 					System.out.println("O");
	 				}
	 				if(i == 2 && lauta[0][i] == 0) {
	 					System.out.println("");
	 				}
	 			}
	 			
	 			System.out.println("- + - + -");
	 			
	 			for(int i = 0; i < lauta.length; i++) {
	 				if(lauta[1][i] == 1 && i != 2) {
	 					System.out.print("X | ");
	 				}
	 				if(lauta[1][i] == 2 && i != 2) {
	 					System.out.print("O | ");
	 				}
	 				if(lauta[1][i] == 0 && i != 2) {
	 					System.out.print("  | ");
	 				}
	 				if(i == 2 && lauta[1][i] == 1) {
	 					System.out.println("X");
	 				}
	 				if(i == 2 && lauta[1][i] == 2) {
	 					System.out.println("O");
	 				}
	 				if(i == 2 && lauta[1][i] == 0) {
	 					System.out.println("");
	 				}
	 			}
	 			
	 			System.out.println("- + - + -");
	 			
	 			for(int i = 0; i < lauta.length; i++) {
	 				if(lauta[2][i] == 1 && i != 2) {
	 					System.out.print("X | ");
	 				}
	 				if(lauta[2][i] == 2 && i != 2) {
	 					System.out.print("O | ");
	 				}
	 				if(lauta[2][i] == 0 && i != 2) {
	 					System.out.print("  | ");
	 				}
	 				if(i == 2 && lauta[2][i] == 1) {
	 					System.out.println("X");
	 				}
	 				if(i == 2 && lauta[2][i] == 2) {
	 					System.out.println("O");
	 				}
	 				if(i == 2 && lauta[2][i] == 0) {
	 					System.out.println("");
	 				}
	 			}
		}

		/**
		 * Kertoo onko viimeisin merkin asetusyritys onnistunut
		 * @return boolean
		 */
		public boolean asetettiinkoMerkki() {
			return asetettiinkoMerkki;
		}
	
		/**
		 * Asettaa pelilaudalle ihmisen valitsemaan ruutuun merkin
		 * @param paikka Ruudun numeroviittaus
		 * @param merkki Merkin numeroviittaus: 1 = X ja 2 = O
		 */
		public void ihminenAsetaMerkki(int paikka, int merkki) {
			
			asetettiinkoMerkki = true;
			if(paikka == 1 && lauta[0][0] == 0){
				lauta[0][0] = merkki;
			}else if(paikka == 2 && lauta[0][1] == 0){
				lauta[0][1] = merkki;
			}else if(paikka == 3 && lauta[0][2] == 0){
				lauta[0][2] = merkki;
			}else if(paikka == 4 && lauta[1][0] == 0){
				lauta[1][0] = merkki;
			}else if(paikka == 5 && lauta[1][1] == 0){
				lauta[1][1] = merkki;
			}else if(paikka == 6 && lauta[1][2] == 0){
				lauta[1][2] = merkki;
			}else if(paikka == 7 && lauta[2][0] == 0){
				lauta[2][0] = merkki;
			}else if(paikka == 8 && lauta[2][1] == 0){
				lauta[2][1] = merkki;
			}else if(paikka == 9 && lauta[2][2] == 0){
				lauta[2][2] = merkki;
			}else {
				asetettiinkoMerkki = false;
				System.out.println("Tuossa ruudussa on jo merkki.");
			}
		}
		
		/**
		 * Asettaa pelilaudalle tietokoneen valitsemaan ruutuun merkin
		 * @param paikka Ruudun numeroviittaus
		 * @param merkki Merkin numeroviittaus: 1 = X ja 2 = O
		 */
		public void tietokoneAsetaMerkki(int paikka, int merkki) {
			
			
			
			asetettiinkoMerkki = true;
			if(paikka == 1 && lauta[0][0] == 0){
				lauta[0][0] = merkki;
			}else if(paikka == 2 && lauta[0][1] == 0){
				lauta[0][1] = merkki;
			}else if(paikka == 3 && lauta[0][2] == 0){
				lauta[0][2] = merkki;
			}else if(paikka == 4 && lauta[1][0] == 0){
				lauta[1][0] = merkki;
			}else if(paikka == 5 && lauta[1][1] == 0){
				lauta[1][1] = merkki;
			}else if(paikka == 6 && lauta[1][2] == 0){
				lauta[1][2] = merkki;
			}else if(paikka == 7 && lauta[2][0] == 0){
				lauta[2][0] = merkki;
			}else if(paikka == 8 && lauta[2][1] == 0){
				lauta[2][1] = merkki;
			}else if(paikka == 9 && lauta[2][2] == 0){
				lauta[2][2] = merkki;
			}else {
				asetettiinkoMerkki = false;
			}
		}

		/**
		 * Asettaa pelilaudan ruutujen arvoksi 0
		 */
		public void tyhjennäLauta() {
			for(int i = 0; i < lauta.length; i++) {
				for(int j = 0; j < lauta.length; j++) {
					lauta[i][j] = 0;
				}
			}
		}
		
		/**
		 * Tarkistaa onko pelilaudalla 3 samaa merkkiä peräkkäin
		 * @return boolean
		 */
		public boolean onkoVoittoa() {
			
			boolean onko = false;
			
			for(int i = 0; i < lauta.length; i++){
				for(int j = 0; j < lauta.length; j++){
					if(lauta[i][j] == 1 && j == 2){
						onko = true;
					}
					if(lauta[i][j] != 1){
						break;
					}
				}
			}

			for(int j = 0; j < lauta.length; j++){
				for(int i = 0; i < lauta.length; i++){
					if(lauta[i][j] == 1 && i == 2){
						onko = true;
					}
					if(lauta[i][j] != 1){
						break;
					}
				}
			}

			for(int i = 0; i < lauta.length; i++){
				for(int j = 0; j < lauta.length; j++){
					if(lauta[i][j] == 2 && j == 2){
						onko = true;
					}
					if(lauta[i][j] != 2){
						break;
					}
				}
			}
			
			for(int j = 0; j < lauta.length; j++){
				for(int i = 0; i < lauta.length; i++){
					if(lauta[i][j] == 2 && i == 2){
						onko = true;
					}
					if(lauta[i][j] != 2){
						break;
					}
				}
			}

			for(int i = 0, j = 0; i < lauta.length && j < lauta.length; i++, j++){
				
				if(lauta[i][j] == 1 && j == 2 && i == 2){
					onko = true;
				}
				if(lauta[i][j] != 1){
					break;
				}
			}

			for(int i = 2, j = 0; i < lauta.length && j < lauta.length; i--, j++){

				if(lauta[i][j] == 1 && j == 2 && i == 0){
					onko = true;
				}
				if(lauta[i][j] != 1){
					break;
				}
			}
			
			for(int i = 0, j = 0; i < lauta.length && j < lauta.length; i++, j++){

				if(lauta[i][j] == 2 && j == 2 && i == 2){
					onko = true;
				}
				if(lauta[i][j] != 2){
					break;
				}

			}

			for(int i = 2, j = 0; i < lauta.length && j < lauta.length; i--, j++){

				if(lauta[i][j] == 2 && j == 2 && i == 0){
					onko = true;
				}
				if(lauta[i][j] != 2){
					break;
				}
			}
			
			return onko;
		}
		
		/**
		 * Tarkistaa onko pelilaudan kaikissa ruuduissa jokin muu arvo kuin 0
		 * @return boolean
		 */
		public boolean onkoTäynnä() {
			
			for(int i = 0; i < lauta.length; i++) {
				for(int j = 0; j < lauta.length; j++) {
					if (lauta[i][j] == 0) {
						return false;
					}
				}
			}
			return true;
		}
		
		/**
		 * Tarkistaa pelin lopputuloksen
		 * @return int:
		 * 1 = X pelaaja voitti, 2 = O pelaaja voitti, 0 = tasapeli
		 */
		public int voittaja() {
			int voittaja = 0;

			for(int i = 0; i < lauta.length; i++){
				for(int j = 0; j < lauta.length; j++){
					if(lauta[i][j] == 1 && j == 2){
						voittaja = 1;
					}
					if(lauta[i][j] != 1){
						break;
					}
				}
			}

			for(int j = 0; j < lauta.length; j++){
				for(int i = 0; i < lauta.length; i++){
					if(lauta[i][j] == 1 && i == 2){
						voittaja = 1;
					}
					if(lauta[i][j] != 1){
						break;
					}
				}
			}

			for(int i = 0; i < lauta.length; i++){
				for(int j = 0; j < lauta.length; j++){
					if(lauta[i][j] == 2 && j == 2){
						voittaja = 2;
					}
					if(lauta[i][j] != 2){
						break;
					}
				}
			}
			
			for(int j = 0; j < lauta.length; j++){
				for(int i = 0; i < lauta.length; i++){
					if(lauta[i][j] == 2 && i == 2){
						voittaja = 2;
					}
					if(lauta[i][j] != 2){
						break;
					}
				}
			}

			for(int i = 0, j = 0; i < lauta.length && j < lauta.length; i++, j++){
				
				if(lauta[i][j] == 1 && j == 2 && i == 2){
					voittaja = 1;
				}
				if(lauta[i][j] != 1){
					break;
				}
			}

			for(int i = 2, j = 0; i < lauta.length && j < lauta.length; i--, j++){

				if(lauta[i][j] == 1 && j == 2 && i == 0){
					voittaja = 1;
				}
				if(lauta[i][j] != 1){
					break;
				}
			}
			
			for(int i = 0, j = 0; i < lauta.length && j < lauta.length; i++, j++){

				if(lauta[i][j] == 2 && j == 2 && i == 2){
					voittaja = 2;
				}
				if(lauta[i][j] != 2){
					break;
				}

			}

			for(int i = 2, j = 0; i < lauta.length && j < lauta.length; i--, j++){

				if(lauta[i][j] == 2 && j == 2 && i == 0){
					voittaja = 2;
				}
				if(lauta[i][j] != 2){
					break;
				}
			}
			
			

			return voittaja;
		}
	
		/**
		 * Palauttaa nykyisen tilanteen
		 * @return int[]
		 */
		public int[] annaTilanne() {
			return tilanne;
		}

		/**
		 * Lisää X pelaajalle pisteen
		 */
		public void pelaaja1Voitti() {
			tilanne[0] ++;
		}
		
		/**
		 * Lisää O pelaajalle pisteen
		 */
		public void pelaaja2Voitti() {
			tilanne[1] ++;
		}

		/**
		 * Tulostaa tilanteen. Taulukon ensimmäinen arvo on X pelaajan pisteet. Taulukon toinen arvo on O pelaajan pisteet.
		 */
		public void tulostaTilanne() {
			System.out.println();
			System.out.println("Tilanne on:");
			System.out.println(Arrays.toString(tilanne));
		}

		/**
		 * Asettaan tilanteeksi 0-0
		 */
		public void poistaTilanne() {
			tilanne[0] = 0;
			tilanne[1] = 0;
		}
		
		/**
		 * Lataa tallennus.txt tiedostosta viimeisimmän tallennetun tilanteen tilanne taulukkoon.
		 */
		public void lataa() {
			try {
				BufferedReader br = new BufferedReader(new FileReader("tallennus.TXT"));
				
				tilanne[0] = Integer.parseInt(br.readLine());
				tilanne[1] = Integer.parseInt(br.readLine());
					
				br.close();
				
			}catch(Exception e) {
			}
		}

		/**
		 * Tallentaa nykyisen tilanteen tallennus.txt tiedostoon.
		 */
		public void tallenna() {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("tallennus.txt"));
				
				bw.write(Integer.toString(tilanne[0]));
				bw.newLine();
				bw.write(Integer.toString(tilanne[1]));
				
				bw.close();
				
			}catch(Exception e) {
				
			}
		}
		
		/**
		 * Asettaa tallennus.txt tiedostoon tilanteeksi 0-0
		 */
		public void poistaTallennus() {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("tallennus.txt"));
				
				bw.write(0);
				bw.newLine();
				bw.write(0);
				
				bw.close();
				
			}catch(Exception e) {
				
			}
		}
		
}	