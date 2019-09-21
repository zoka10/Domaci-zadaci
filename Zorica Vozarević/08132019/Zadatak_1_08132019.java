package cetvrti_dan;

import java.util.Scanner;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10, j=5, k=8;
		k=j++ // prvo smo uzeli vrednost J-dodali je K (k je sada 5), i onda smo dodali vrednost J i ona je 6
		k=j++ + ++i//prvo smo uzeli vrednost J i dodali joj vrednost (7), onda dodajemo vrednost I i upisujemo(11) dobijene brojeve saberemo i dodamo zbir K(17)
				
		i=++j//prvo dodajemo vrednost J i povecava se(8) i dodeljujemo vrednost I (8)
		i=++j + ++k//prvo dodajemo vrednost J i onda je upisujemo (9), onda dodajemo vrednost K i upisujemo (18) dobijene brojeve saberemo i dodamo zbir  I(27)		
		
		k=i--//prvo uzimamo vrednost I dodeljujemo je K (27) i onda je umanjujemo I(26)
		k=i-- - ++j//prvo uzimamo vrednost I i umanjujemo je (25), onda dodajemo vrednost J i upisujemo (10) dobijene brojeve oduzmemo i dodamo zbir K(15)
		
		j=--i//prvo umanjujemo vrednost I i umanjuje se (24) i dodeljujemo vrednost J (24)
		j= --i * k--//prvo umanjujemo vrednost I (24), onda uzmemo vrednost K i umnjimo (14), onda dobijene brojeve pomnozimo i dobijemo J(336)
