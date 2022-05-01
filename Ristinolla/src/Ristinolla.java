import java.util.Scanner;

public class Ristinolla {

	/**
	 * Käynnistää ristinolla pelin
	 */
		public void pelaa(){
			
			Scanner scanner = new Scanner(System.in);
			
			Pelilauta lauta = new Pelilauta();		
			
			String syöte;
			
			boolean vaihto;
			
			boolean uudestaan = false;
			
			int pelaajia = -1;
			
			do {
				do{
					
					System.out.println("Kuinka monta pelaajaa? (1 vai 2)");
					
					syöte = scanner.nextLine();
					
					try {
						pelaajia = Integer.parseInt(syöte);
					}catch(NumberFormatException e) {
					}
					
					if(pelaajia == 1) {
						YksilöPelaaja pelaaja = new YksilöPelaaja();
					
						TietokonePelaaja tietokone = new TietokonePelaaja();
						
						lauta.esimerkkiLauta();
						
						System.out.println("Aloitetaan peli!");
						System.out.println();
			
						do {
							
							lauta.tyhjennäLauta();
							
							do {
								if(lauta.onkoTäynnä() == false) {
									do {
										lauta.ihminenAsetaMerkki(pelaaja.pelattavaRuutu(),1);
									}while(lauta.asetettiinkoMerkki() == false);
									lauta.tulostaLauta();
								}
								
								if(lauta.onkoTäynnä() == false && lauta.onkoVoittoa() == false) {
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
								
							}while(lauta.onkoTäynnä() == false && lauta.onkoVoittoa() == false);
							
								
							if(lauta.voittaja() == 1) {
								System.out.println("Voitit pelin!");
							}else if(lauta.voittaja() == 2){
								System.out.println("Tietokone päihitti sinut!");
							}else if(lauta.voittaja() == 0){
								System.out.println("Tasapeli!");
							}
							
							System.out.println();
							System.out.println("Haluatko pelata uudestaan? (K / E)");
							syöte = scanner.nextLine();
							
							if(syöte.equals("k") || syöte.equals("k") || syöte.equals("Kyllä") || syöte.equals("Joo")){
								uudestaan = true;
							}else if(syöte.equals("e") || syöte.equals("E") || syöte.equals("Ei") || syöte.equals("En")) {
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
							
							lauta.tyhjennäLauta();
							
							System.out.println("Haluatteko ladata aiemman tilanteen? (K / E)");
							syöte = scanner.nextLine();
							
							if(syöte.equals("k") || syöte.equals("k") || syöte.equals("Kyllä") || syöte.equals("Joo")){
								lauta.lataa();
							}else if(syöte.equals("e") || syöte.equals("E") || syöte.equals("Ei") || syöte.equals("En")) {
								lauta.poistaTallennus();
								lauta.poistaTilanne();
							}else {
								lauta.poistaTallennus();
								lauta.poistaTilanne();
								System.out.print("Tulkitsen tuon vastaukseksi ei :D");
							}
							
							
							do {
								
								if(lauta.onkoTäynnä() == false) {
									do {
										lauta.ihminenAsetaMerkki(pelaaja1.pelattavaRuutu(),1);
									}while(lauta.asetettiinkoMerkki() == false);
									lauta.tulostaLauta();
								}
								
								if(lauta.onkoTäynnä() == false && lauta.onkoVoittoa() == false) {
									do {
										lauta.ihminenAsetaMerkki(pelaaja2.pelattavaRuutu(),2);
									}while(lauta.asetettiinkoMerkki() == false);
									lauta.tulostaLauta();
								}
								
							}while(lauta.onkoTäynnä() == false && lauta.onkoVoittoa() == false);
							
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
							syöte = scanner.nextLine();
							
							if(syöte.equals("k") || syöte.equals("k") || syöte.equals("Kyllä") || syöte.equals("Joo")){
								uudestaan = true;
							}else if(syöte.equals("e") || syöte.equals("E") || syöte.equals("Ei") || syöte.equals("En")) {
								uudestaan = false;
							}else {
								uudestaan = false;
								System.out.print("Tulkitsen tuon vastaukseksi ei :D");
							}
							
						}while(uudestaan);	
					}
					if(pelaajia != 1 && pelaajia != 2){
						System.out.println("Käytä vain ohjeen mukaisia vastausvaihtoehtoja.");
						
					}
				}while(pelaajia != 1 && pelaajia != 2);
				
				
			}while(false);
			
			
			
			scanner.close();
		}
}