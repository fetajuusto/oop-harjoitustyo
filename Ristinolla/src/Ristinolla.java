import java.util.Scanner;

public class Ristinolla {

	/**
	 * K�ynnist�� ristinolla pelin
	 */
		public void pelaa(){
			
			Scanner scanner = new Scanner(System.in);
			
			Pelilauta lauta = new Pelilauta();		
			
			String sy�te;
			
			boolean vaihto;
			
			boolean uudestaan = false;
			
			int pelaajia = -1;
			
			do {
				do{
					
					System.out.println("Kuinka monta pelaajaa? (1 vai 2)");
					
					sy�te = scanner.nextLine();
					
					try {
						pelaajia = Integer.parseInt(sy�te);
					}catch(NumberFormatException e) {
					}
					
					if(pelaajia == 1) {
						Yksil�Pelaaja pelaaja = new Yksil�Pelaaja();
					
						TietokonePelaaja tietokone = new TietokonePelaaja();
						
						lauta.esimerkkiLauta();
						
						System.out.println("Aloitetaan peli!");
						System.out.println();
			
						do {
							
							lauta.tyhjenn�Lauta();
							
							do {
								if(lauta.onkoT�ynn�() == false) {
									do {
										lauta.ihminenAsetaMerkki(pelaaja.pelattavaRuutu(),1);
									}while(lauta.asetettiinkoMerkki() == false);
									lauta.tulostaLauta();
								}
								
								if(lauta.onkoT�ynn�() == false && lauta.onkoVoittoa() == false) {
									do {
										lauta.tietokoneAsetaMerkki(tietokone.pelattavaRuutu(),2);
										
										System.out.println();
										System.out.println("----------");
										System.out.println();
										System.out.println("Tietokone asettaa merkin");
										System.out.println();
										
										lauta.tulostaLauta();
						
									}while(lauta.asetettiinkoMerkki() == false);
								}
								
							}while(lauta.onkoT�ynn�() == false && lauta.onkoVoittoa() == false);
							
								
							if(lauta.voittaja() == 1) {
								System.out.println("Voitit pelin!");
							}else if(lauta.voittaja() == 2){
								System.out.println("Tietokone p�ihitti sinut!");
							}else if(lauta.voittaja() == 0){
								System.out.println("Tasapeli!");
							}
							
							System.out.println();
							System.out.println("Haluatko pelata uudestaan? (K / E)");
							sy�te = scanner.nextLine();
							
							if(sy�te.equals("k") || sy�te.equals("k") || sy�te.equals("Kyll�") || sy�te.equals("Joo")){
								uudestaan = true;
							}else if(sy�te.equals("e") || sy�te.equals("E") || sy�te.equals("Ei") || sy�te.equals("En")) {
								uudestaan = false;
							}else {
								uudestaan = false;
								System.out.print("Tulkitsen tuon vastaukseksi ei :D");
							}
							
						}while(uudestaan);
					}
					if(pelaajia == 2) {
						IhmisPelaaja pelaaja1 = new IhmisPelaaja();
						
						IhmisPelaaja pelaaja2 = new IhmisPelaaja();
						
						lauta.esimerkkiLauta();
						
						System.out.println("Aloitetaan peli!");
						System.out.println();
			
						do {
							
							lauta.tyhjenn�Lauta();
							
							System.out.println("Haluatteko ladata aiemman tilanteen? (K / E)");
							sy�te = scanner.nextLine();
							
							if(sy�te.equals("k") || sy�te.equals("k") || sy�te.equals("Kyll�") || sy�te.equals("Joo")){
								lauta.lataa();
							}else if(sy�te.equals("e") || sy�te.equals("E") || sy�te.equals("Ei") || sy�te.equals("En")) {
								lauta.poistaTallennus();
								lauta.poistaTilanne();
							}else {
								lauta.poistaTallennus();
								lauta.poistaTilanne();
								System.out.print("Tulkitsen tuon vastaukseksi ei :D");
							}
							
							
							do {
								
								if(lauta.onkoT�ynn�() == false) {
									do {
										lauta.ihminenAsetaMerkki(pelaaja1.pelattavaRuutu(),1);
									}while(lauta.asetettiinkoMerkki() == false);
									lauta.tulostaLauta();
								}
								
								if(lauta.onkoT�ynn�() == false && lauta.onkoVoittoa() == false) {
									do {
										lauta.ihminenAsetaMerkki(pelaaja2.pelattavaRuutu(),2);
									}while(lauta.asetettiinkoMerkki() == false);
									lauta.tulostaLauta();
								}
								
							}while(lauta.onkoT�ynn�() == false && lauta.onkoVoittoa() == false);
							
							if(lauta.voittaja() == 1) {
								lauta.pelaaja1Voitti();
								System.out.println("Pelaaja 1 voitti!");
							}else if(lauta.voittaja() == 2){
								System.out.println("Pelaaja 2 voitti!");
								lauta.pelaaja2Voitti();
							}else if(lauta.voittaja() == 0){
								System.out.println("Tasapeli!");
							}
							lauta.tulostaTilanne();
							lauta.tallenna();
							
							System.out.println();
							System.out.println("Haluatteko pelata uudestaan? (K / E)");
							sy�te = scanner.nextLine();
							
							if(sy�te.equals("k") || sy�te.equals("k") || sy�te.equals("Kyll�") || sy�te.equals("Joo")){
								uudestaan = true;
							}else if(sy�te.equals("e") || sy�te.equals("E") || sy�te.equals("Ei") || sy�te.equals("En")) {
								uudestaan = false;
							}else {
								uudestaan = false;
								System.out.print("Tulkitsen tuon vastaukseksi ei :D");
							}
							
						}while(uudestaan);	
					}
					if(pelaajia != 1 && pelaajia != 2){
						System.out.println("K�yt� vain ohjeen mukaisia vastausvaihtoehtoja.");
						
					}
				}while(pelaajia != 1 && pelaajia != 2);
				
				
			}while(false);
			
			
			
			scanner.close();
		}
}