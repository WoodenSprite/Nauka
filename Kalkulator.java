package kalkulator;

import java.util.Scanner;


public class Kalkulator 						
{

	public static void main(String[] args) throws InterruptedException		//"throws InterruptedException" pozwala u�y� odliczania
	{
		Scanner skaner = new Scanner(System.in);
		String powrot;
		
		
		System.out.println("Podaj swoje imie");
		String imie = skaner.nextLine();
		System.out.println("Podaj swoje nazwisko");
		String nazwisko = skaner.nextLine();
		
		
		
		System.out.println("\n");
		System.out.println("Witaj "+imie +" "+ nazwisko+" w aplikacji Kalkulator");	
//		System.out.println("Program uruchomi si� za:");
		
		
		for( int i = 2; i >=0; i--)				//odlicza od 2 do 0 - pod zera podstawione wyr�enia
		{
			if(i==2)
			{
				System.out.println("\nDo Liczenia...");
			}
			else if(i==1)
			{
				System.out.println("Gotowi...");
			}
			else if(i==0)
			{
				System.out.println("START! ");
			}
			Thread.sleep(1000);
		}
		
		do											//Pocz�tek do
		{
		System.out.println();
		System.out.println("==========================================");
		System.out.println("|    Wybierz interesuj�ce Cie dzia�anie  |");
		System.out.println("==========================================");
		System.out.println("|            1) Dodawanie                |");
		System.out.println("|            2) Odejmowanie              |");
		System.out.println("|            3) Mno�enie                 |");
		System.out.println("|            4) Dzielenie                |");
		System.out.println("|            5) Pot�gowanie              |");
		System.out.println("|            6) Pierwiastkowanie         |");
		System.out.println("==========================================");
		
		int i = skaner.nextInt();
		
		if( i>0 || i<7 )										//pocz�tek if
		{
		 switch (i)												//pocz�tek switch
		 {
		 
		 case 1:
			 System.out.println("Podaj liczby, na kt�rych chcesz dokona� dzia�ania");
			 System.out.println("Podaj pierwsz� liczb�");
			 double x1 = skaner.nextDouble();
			 System.out.println("Podaj drug� liczb�");
			 double x2 = skaner.nextDouble();
			 			 
			 System.out.println("Wynik dodawania to: "+ (x1+x2));
			 break;
			 
		 case 2:
			 System.out.println("Podaj liczby, na kt�rych chcesz dokona� dzia�ania");
			 System.out.println("Podaj pierwsz� liczb�");
			 double x3 = skaner.nextDouble();
			 System.out.println("Podaj drug� liczb�");
			 double x4 = skaner.nextDouble();
			 
			 System.out.println("Wynik odejmowania to: "+ (x3-x4));
			 break;
			 
		 case 3:
			 System.out.println("Podaj liczby, na kt�rych chcesz dokona� dzia�ania");
			 System.out.println("Podaj pierwsz� liczb�");
			 double x5 = skaner.nextDouble();
			 System.out.println("Podaj drug� liczb�");
			 double x6 = skaner.nextDouble();
			 
			 System.out.println("Wynik mno�enia to: "+ (x5*x6));
			 break;
			 
		 case 4:
			 System.out.println("Podaj liczby, na kt�rych chcesz dokona� dzia�ania");
			 System.out.println("Podaj pierwsz� liczb�");
			 double x7 = skaner.nextDouble();
			 System.out.println("Podaj drug� liczb�");
			 double x8 = skaner.nextDouble();
			 double wynik = x7*x8;
			 
			 if(x7==0)
			 {
				 System.out.println("Od kiedy to zero mo�na dzieli� ;)");			 
				 
			 }
			 if(x8==0)
			 {
				 System.out.println("Nie mozna dzielic przez zero ;)");
				 
			 }
			 else
			 {
			 System.out.println("Wynik dzielenia to: "+ wynik);		
			 }
			 break;
			 
		 case 5:
			 System.out.println("Podaj liczby, na kt�rych chcesz dokona� dzia�ania");
			 System.out.println("Podaj liczb�, kt�ra ma by� pot�gowana");
			 double xa = skaner.nextDouble();
			 System.out.println("Podaj do jakiej pot�gi podnie�� "+xa);
			 double xb = skaner.nextDouble();
			 double wynik1 = Math.pow(xa, xb);
			 
			 System.out.println("Wynik pot�gowania to " + wynik1);
			 break;
			 
		 case 6:
			 System.out.println("Podaj liczb�, kt�r� chcesz pierwiastkowa�");
			 double xc = skaner.nextDouble();
			 
			 double wynik2 = Math.sqrt(xc);
			 System.out.println("Pierwiastek z "+xc+" wynosi "+wynik2);
			 break;
			 
		 default:
				 System.out.println("B��d - wybierz opcje od 1 do 6");
				 break;
				 
					 
		 }  //koniec switch
		}  // koniec if
		
		System.out.println("\n");
		System.out.println("Je�eli chcesz wyjsc z programu wcisnij 'k' je�eli chcesz wykona� kolejne dzia�ania wcisnij inny znak");
		powrot = skaner.next();
		
		}
		while(!powrot.equalsIgnoreCase("k"));			//koniec do z ewentualnym powrotem do menu
		
		if(powrot.equals("k"))
			{
			System.out.println("Program zako�czy� dzia�anie...");
			}		//koniec if
	}  //koniec main

}  //koniec class
