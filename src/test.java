import java.util.Scanner;

public class test {

public static void main (String []arg) {
		
		
		Boolean sortir = false;
		int opcio;
		
		while (sortir != true) {
			pinta("UD2 ACTIVITAT 1");
			pinta("Escull la funcio (1-24). 0 sortir:");
			
			Scanner sc = new Scanner(System.in);
		
			opcio = sc.nextInt();
			
			if (opcio==0) {
				sortir = true;
				pinta("by");	
			}else {
				menu(opcio);
			}
			
		}
		
	}
	
	public static void menu(int opcio) {
		
		ImplFormules ff=new ImplFormules();
		
		switch (opcio) {
        case 1:  
        	pinta("1. Escriu “Hola món!” per pantalla.");
        	ff.holamon();
        	break;
        	
        case 2:  
        	pinta("2. Llegeix dos nombres reals i escriu la seva suma, resta, producte i quocient.");
        	
        	pinta("Escriu el primer:");
        	Double a = preguntaDouble();
        	
        	pinta("Escriu el segon:");
        	Double b = preguntaDouble();
        	
        	ff.sumRestProdQuo(a, b);
            break;
            
        case 3:  
        	break;
        case 4:  
        	break;
        case 5:  
        	break;
        case 6:  
        	break;
        case 7:  
        	break;
        case 8:  
        	break;
        case 9:  
        	break;
        	
        case 10: 
     
        	pinta("/**10. Passa segons a una string amb el format hh:mm:ss");
        	pinta("Escriu segons:");
        	Integer s = preguntaEnter();
        	pinta(ff.passaHMS(s));
        	
        	break;
        	
        case 11:  
        	break;
        case 12:  
        	break;
        case 13:
        	break;
        case 14:
        	break;
        case 15:
        	break;
        case 16:
        	break;
        case 17:
        	break;
        case 18:
        	break;
        case 19:
        	break;
        case 20:
        	break;
        case 21:
        	break;
        	
        case 22:
        	pinta("/**22. Codifica un programa que calculi la velocitat d'un tren en km/hora, coneixent la");
        	pinta("distància recorreguda en metros i el temps emprat en segons per recórrer aquesta");
        	pinta("distància.");
        	
        	pinta("Escriu metres:");
        	Double e = preguntaDouble();
        	
        	pinta("Escriu temps:");
        	Double t = preguntaDouble();
        	
        	pinta(ff.vtren(e, t));
        	
        	break;
        	
        case 23:
        	pinta("/**23.Codifica un programa que donats tres enters que representen hores,"); 
        	pinta("minuts i segons, doni l'equivalent en segons.");
        	
        	pinta("Encriu hores:");
        	Integer h=preguntaEnter();
        	pinta("Encriu minuts:");
        	Integer m=preguntaEnter();
        	pinta("Encriu segons:");
        	Integer ss=preguntaEnter();
        	
        	pinta(ff.hmsToSegons(h, m, ss));
        	
        	break;
        	
        case 24:
        	break;
        default: 
        	pinta("bye!");
        	break;
		}
    }
		
	
	
	public static void pinta(Object o) {
		System.out.println(o);
	}
	
	
	public static Integer preguntaEnter() {
		Integer n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		return n;
	}
	
	public static Double preguntaDouble() {
		Double n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextDouble();
		return n;
	}
	
	
	


}
