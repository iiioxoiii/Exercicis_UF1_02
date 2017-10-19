public class ImplFormules implements Formules{
	


	/**1. Escriu “Hola món!” per pantalla.
	 * @return
	 */
	public String holamon () {

		return "Hola mòn";
	}
	
	
	/**2. Llegeix dos nombres reals i escriu la seva suma,
	resta, producte i quocient.
	 * @param a
	 * @param b
	 * @return
	 */
	public String sumRestProdQuo(Double a, Double b) {
		Double suma = a+b;
		Double resta = a-b;
		Double producte = a*b;
		Double quocient = a/b;
		
		return suma + " " + resta + " " + producte + " " + quocient;
	}
	
	
	/**3. Llegeix el radi d’un cercle i escriu el seu perímetre i àrea.
	 * @param r
	 * @return Retorna una cadena "Hola món"
	 */
	public String perimetreCercle(Double r) {
		return (2*Math.PI*r) + " "+(Math.PI*(r*r));
	}
	
	
	/**4. Llegeix tres nombres reals i troba la seva mitja aritmètica.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public Double mitjana(Double a, Double b, Double c) {
		return ((a+b+c)/3);
	}
	
	
	/**5. Llegeix la base i l'altura d'un triangle i escriu la seva àrea.
	 * @param b
	 * @param a
	 * @return
	 */
	public Double areaTriangle(Double b, Double a) {
		return ((b*a)/2);
	}
	
	
	/**6. Llegeix el preu d'un producte, l'IVA (en %) i el descompte (en %) a aplicar. 
	 * Escriu el preu final del producte.
	 * @param p
	 * @param i
	 * @param d
	 * @return
	 */
	public Double preuFinal(Double p, Double i ,Double d) {
		//El descompte s'aplica al preu net (preu+iva)
		Double st = p+((p*i)/100);
		return st-(st+((st*i)/100));
	
	}
	
	
	/**7. Calcula l'àrea lateral i el volum d'un cilindre recte, 
	 * introduint per teclat els valors del radi i l'altura.
	 * @param r
	 * @param a
	 * @return
	 */
	public Double areaLateralCilindre(Double r, Double a) {
		return (a*(2*Math.PI*r));
	}
	
	
	/**8. Llegeix un nombre enter d’hores, minuts i segons i escriu el nombre de segons
	//	equivalents.
	 * @param r
	 * @param a
	 * @return
	 */
	public Double volumCilindre(Double r, Double a) {
		return (Math.PI*(r*r)*a);
	}
	
	
	/**9. Llegeix un nombre enter de segons i escriu el nombre d’hores, minuts i segons 
	 * equivalents en format h:m:s.
	 * @param h
	 * @param m
	 * @param s
	 * @return
	 */
	public Integer passaSegons(Integer h, Integer m, Integer s) {
		return s+(m*60)+(h*3600);
	}
	
	/**10. Passa segons a una string amb el format hh:mm:ss
	 * @param s
	 * @return
	 */
	public String passaHMS (Integer s) {
		int hores = (s/3600);
		int minuts = ((s%3600)/60);
		int segons = ((s%3600)%60);
		
		String hh,mm,ss;
		
		if (hores < 10) {
			hh = '0'+Integer.toString(hores);
		}else {
			hh = Integer.toString(hores);
		}
		
		if (minuts < 10) {
			mm = '0'+Integer.toString(minuts);
		}else {
			mm = Integer.toString(minuts);
		}
	
		if (segons < 10) {
			ss = '0'+Integer.toString(segons);
		}else {
			ss = Integer.toString(segons);
		}
		
		return hh + ":" + mm + ":" + ss;
	}
	
	
	/**11. Llegeix la distància entre dos aeroports en km i la velocitat 
	 * mitjana de l’avió en km/h, i escriu el temps estimat de vol en 
	 * format h:m.
	 * @param d
	 * @param v
	 * @return
	 */
	public String calculaTempsVol(Double d, Double v) {
		
		Double t = d/v;
		t= t*3600;
		Integer t1 = t.intValue();
		return passaHMS(t1);
	} 

	
	/**12. Llegeix una temperatura en graus Celsius i escriu el valor equivalent
	 * en graus Fahrenheit. L'escala Celsius assigna al punt de fusió del gel el
	 * valor 0 i al punt d'ebullició de l'aigua el valor 100, mentre que l'escala 
	 * Fahrenheit assigna a aquest punts els valors 32 i 212
	 * @param c
	 * @return
	 */
	public Double celsiusToFarenheit(Double c) {
		return ((c - 32)*5)/9;
	}
	
	
	/**13. Passa de graus farenheit a celsius
	 * @param c
	 * @return
	 */
	public Double farenheitToCelsius(Double f) {
		return f * 9/5 + 32;
	}
	
	
	/**14. Llegeix la distància del satèl·lit a la superfície terrestre en m,
	 * calcula el període de rotació del satèl·lit en torn del planeta i 
	 * l’escriu en hores i minuts.
	 * @param h
	 * @return
	 */
	public String periodeRotacio(Double h) {
		Double t,R,g;
		Integer s;
				
		R=6371000.;
		g=9.81;
	
		t=((2*Math.PI*Math.pow(R+h,3./2.))/(R*Math.sqrt(g)));
		
		s=t.intValue();
		return passaHMS(s);
	}
	
	/** 15. ATENCIÓ!!! La formula dd cal revisarla
	 * @param v
	 * @param a
	 * @return
	 */
	public String projectil(Double v, Double a) {
		Double t,dd;
		Double g=9.81;
		
		t = (2*v*Math.sin(a))/g;
		dd = (((v*v)*Math.sin(2*t)))/g;
		
		return "t="+t+" d="+dd;
	}
	
	
	/**16. Llegeix les coordenades de dos punts per trobar les coordenades
	 * del seu punt mig.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public String puntMig(Double x1, Double y1, Double x2, Double y2) {
		
		return "("+(x1+x2/2)+","+(y1+y2/2)+")";
	}
	
	
	/**17.
	 * @param
	 * @param
	 * @return
	 * **/
	public Integer mostraPosicio(Integer n, Integer i) {
		String c = n.toString();
		i=i+1;
		
		return c.codePointAt(i);
	}
	
	
	/**18. Llegeix dos nombres reals, posa'ls en dues variables, 
	 * intercanvia el contingut de les dues variables i escriu el seu valor.
	 * @param a
	 * @param b
	 * @return
	 */
	public String intercanvi(Double a, Double b) {
		Double t;
		t=a;
		a=b;
		b=t;
		
		return "a="+a+" b="+b;
		
	}
	
	
	/**19. Codifica un programa que calculi l'àrea d'un trapezi,
	 * introduint per teclat els valors de les bases i la seva altura.
	 * @param b1
	 * @param b2
	 * @param a
	 * @return
	 */
	public Double areaTrapezi(Double b1, Double b2, Double a) {

		return ((b1+b2)*a)/2;
	}

	/**20. Codifica un programa que llegeixi el valor corresponent a una distància en milles
	marines i les escrigui expressades en metros. 1milla marina = 1852 metros.
	 * @param m
	 * @return
	 */
	public Double milesTokm (Double m) {
		
		return m*1852.;
		
	}
	
	
	/**21. Codifica un programa que calculi i mostri per pantalla el percentatge descomptat en
	una compra a partir del preu de la tarifa i del preu pagat (suposarem que no s'aplica IVA).
	 * @param pt
	 * @param pg
	 * @return
	 */
	public Double calculDescompte(Double pt, Double pg) {
		
		return 100-((pg*100)/pt);
	}
	
	
	/**22. Codifica un programa que calculi la velocitat d'un tren en km/hora, coneixent la
	distància recorreguda en metros i el temps emprat en segons per recórrer aquesta
	distància.
	 * @param e
	 * @param t
	 * @return
	 */
	public Double vtren(Double e, Double t) {
		e= e/1000;
		t= t/3600;
		return e*t;
	}
	
	
	/**23.Codifica un programa que donats tres enters que representen hores, 
	 * minuts i segons, doni l'equivalent en segons.
	 * @param h
	 * @param m
	 * @param s
	 * @return
	 */
	public Integer hmsToSegons(Integer h, Integer m, Integer s) {
		return (h*3600)+(m*60)+s;
	}
	
	
	/**24. Codifica un programa que donats tres enters que representen hores, 
	 * minuts i segons, sumi un segon i doni el resultat en el mateix format
	 * @param h
	 * @param m
	 * @param s
	 * @return
	 */
	public String sumaSegon(Integer h, Integer m, Integer s) {
		Integer totalS = hmsToSegons(h,m,s);
		return passaHMS(totalS);
	}
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	