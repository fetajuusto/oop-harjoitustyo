import java.util.Scanner;

public class IhmisPelaaja extends Pelaaja{

	int voitot = 0;
	
	@Override
	int pelattavaRuutu() {
		
		String syöte;
		int ruutuNumero = -1;
		do {
			Scanner s = new Scanner(System.in);
			
			System.out.println();
			System.out.println("Mihin ruutuun haluat merkkisi?");
			syöte = s.nextLine();
			
			try {
				ruutuNumero = Integer.parseInt(syöte);
			}
			catch(NumberFormatException e) {
			}
			
			if(ruutuNumero >= 10 || ruutuNumero <= 0){
				System.out.println("Syötä numero väliltä 1-9!");
			}
		}while(ruutuNumero >= 10 || ruutuNumero <= 0);
		
		return ruutuNumero;
		
	}

	int annaVoitot(){
		return voitot;
	}
	
	void asetaVoitot(int voitot) {
		this.voitot = voitot;
	}
}

