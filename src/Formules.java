public interface Formules {

	/**1. Escriu “Hola món!” per pantalla.
	 * @return
	 */
	String holamon();

	/**2. Llegeix dos nombres reals i escriu la seva suma,
	resta, producte i quocient.
	 * @param a
	 * @param b
	 * @return
	 */
	String sumRestProdQuo(Double a, Double b);

	/**3. Llegeix el radi d’un cercle i escriu el seu perímetre i àrea.
	 * @param r
	 * @return Retorna una cadena "Hola món"
	 */
	String perimetreCercle(Double r);

	/**4. Llegeix tres nombres reals i troba la seva mitja aritmètica.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	Double mitjana(Double a, Double b, Double c);

	/**5. Llegeix la base i l'altura d'un triangle i escriu la seva àrea.
	 * @param b
	 * @param a
	 * @return
	 */
	Double areaTriangle(Double b, Double a);

	/**6. Llegeix el preu d'un producte, l'IVA (en %) i el descompte (en %) a aplicar. 
	 * Escriu el preu final del producte.
	 * @param p
	 * @param i
	 * @param d
	 * @return
	 */
	Double preuFinal(Double p, Double i, Double d);

	/**7. Calcula l'àrea lateral i el volum d'un cilindre recte, 
	 * introduint per teclat els valors del radi i l'altura.
	 * @param r
	 * @param a
	 * @return
	 */
	Double areaLateralCilindre(Double r, Double a);

	/**8. Llegeix un nombre enter d’hores, minuts i segons i escriu el nombre de segons
	//	equivalents.
	 * @param r
	 * @param a
	 * @return
	 */
	Double volumCilindre(Double r, Double a);

	/**9. Llegeix un nombre enter de segons i escriu el nombre d’hores, minuts i segons 
	 * equivalents en format h:m:s.
	 * @param h
	 * @param m
	 * @param s
	 * @return
	 */
	Integer passaSegons(Integer h, Integer m, Integer s);

	/**10. Passa segons a una string amb el format hh:mm:ss
	 * @param s
	 * @return
	 */
	String passaHMS(Integer s);

	/**11. Llegeix la distància entre dos aeroports en km i la velocitat 
	 * mitjana de l’avió en km/h, i escriu el temps estimat de vol en 
	 * format h:m.
	 * @param d
	 * @param v
	 * @return
	 */
	String calculaTempsVol(Double d, Double v);

	/**12. Llegeix una temperatura en graus Celsius i escriu el valor equivalent
	 * en graus Fahrenheit. L'escala Celsius assigna al punt de fusió del gel el
	 * valor 0 i al punt d'ebullició de l'aigua el valor 100, mentre que l'escala 
	 * Fahrenheit assigna a aquest punts els valors 32 i 212
	 * @param c
	 * @return
	 */
	Double celsiusToFarenheit(Double c);

	/**13. Passa de graus farenheit a celsius
	 * @param c
	 * @return
	 */
	Double farenheitToCelsius(Double f);

	/**14. Llegeix la distància del satèl·lit a la superfície terrestre en m,
	 * calcula el període de rotació del satèl·lit en torn del planeta i 
	 * l’escriu en hores i minuts.
	 * @param h
	 * @return
	 */
	String periodeRotacio(Double h);

	/** 15. ATENCIÓ!!! La formula dd cal revisarla
	 * @param v
	 * @param a
	 * @return
	 */
	String projectil(Double v, Double a);

	/**16. Llegeix les coordenades de dos punts per trobar les coordenades
	 * del seu punt mig.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	String puntMig(Double x1, Double y1, Double x2, Double y2);

	/**17.
	 * @param
	 * @param
	 * @return
	 * **/
	Integer mostraPosicio(Integer n, Integer i);

	/**18. Llegeix dos nombres reals, posa'ls en dues variables, 
	 * intercanvia el contingut de les dues variables i escriu el seu valor.
	 * @param a
	 * @param b
	 * @return
	 */
	String intercanvi(Double a, Double b);

	/**19. Codifica un programa que calculi l'àrea d'un trapezi,
	 * introduint per teclat els valors de les bases i la seva altura.
	 * @param b1
	 * @param b2
	 * @param a
	 * @return
	 */
	Double areaTrapezi(Double b1, Double b2, Double a);

	/**20. Codifica un programa que llegeixi el valor corresponent a una distància en milles
	marines i les escrigui expressades en metros. 1milla marina = 1852 metros.
	 * @param m
	 * @return
	 */
	Double milesTokm(Double m);

	/**21. Codifica un programa que calculi i mostri per pantalla el percentatge descomptat en
	una compra a partir del preu de la tarifa i del preu pagat (suposarem que no s'aplica IVA).
	 * @param pt
	 * @param pg
	 * @return
	 */
	Double calculDescompte(Double pt, Double pg);

	/**22. Codifica un programa que calculi la velocitat d'un tren en km/hora, coneixent la
	distància recorreguda en metros i el temps emprat en segons per recórrer aquesta
	distància.
	 * @param e
	 * @param t
	 * @return
	 */
	Double vtren(Double e, Double t);

	/**23.Codifica un programa que donats tres enters que representen hores, 
	 * minuts i segons, doni l'equivalent en segons.
	 * @param h
	 * @param m
	 * @param s
	 * @return
	 */
	Integer hmsToSegons(Integer h, Integer m, Integer s);

	/**24. Codifica un programa que donats tres enters que representen hores, 
	 * minuts i segons, sumi un segon i doni el resultat en el mateix format
	 * @param h
	 * @param m
	 * @param s
	 * @return
	 */
	String sumaSegon(Integer h, Integer m, Integer s);

}