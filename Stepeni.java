import java.util.Scanner;

public class Stepeni{

	public static void main(String[] args) {
	int f; 
	//broj na stepeni vo Farenhajt
	int c;
	//broj na stepeni vo Celziusovi
	//Vlez na podatoci preku tastatura
	Scanner tastatura=new Scanner(System.in);
	//Vcituvanje na stepeni vo Celziusovi od korisnikot
	System.out.print("Vnesete celziusovi stepeni");
	c=tastatura.nextInt();
	//Presmetka na stepeni vo Farenhajt po formula
	f=9*c/5+32;
	//Prikazuvanje na rezultat na ekran
	System.out.print(c+"celziuosovi stepeni=");
	System.out.print(f+"farenhajtovi stepeni=");
	}
}

	
	
	


