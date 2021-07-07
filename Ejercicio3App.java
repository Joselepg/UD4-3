	/**
	 * 3 - Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, 
	 * dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:
	 * El valor de cada variable.
	 * La suma X + Y La suma N + M La suma X + N
	 * La diferencia X – Y La diferencia N – M El cociente Y / M
	 * El producto X * Y El producto N * M El resto Y % M
	 * El cociente X / Y El cociente N / M
	 * El resto X % Y El resto N % M
	 * El doble de cada variable
	 * La suma de todas las variables
	 * El producto de todas las variables
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio3App {

	public static void main(String[] args) {
		int x=4;
		int y=7;
		double n=2.7;
		double m=1.5;
		double result=0;
		
		//SUMAS DE X+Y, N+M, X+N
		result=x+y;
		System.out.println(x+" + "+y+" = "+result);
		result=n+m;
		System.out.println(n+" + "+m+" = "+result);
		result=x+n;
		System.out.println(x+" + "+n+" = "+result);
		//RESTA DE X-Y, N-M, X-N
		result=x-y;
		System.out.println(x+" - "+y+" = "+result);
		result=n-m;
		System.out.println(n+" - "+m+" = "+result);
		result=x-n;
		System.out.println(x+" - "+n+" = "+result);
		//MULTIPLICACION DE X*Y, N*M, X*N
		result=x*y;
		System.out.println(x+" * "+y+" = "+result);
		result=n*m;
		System.out.println(n+" * "+m+" = "+result);
		result=x*n;
		System.out.println(x+" * "+n+" = "+result);
		//DIVISION DE X/Y, N/M, X/N
		result=x/y;
		System.out.println(x+" / "+y+" = "+result);
		result=n/m;
		System.out.println(n+" / "+m+" = "+result);
		result=x/n;
		System.out.println(x+" / "+n+" = "+result);
		//RESTO DE X/Y, N/M, X/N
		result=x%y;
		System.out.println("El resto de "+x+" / "+y+" = "+result);
		result=n%m;
		System.out.println("El resto de "+n+" / "+m+" = "+result);
		result=x%n;
		System.out.println("El resto de "+x+" / "+n+" = "+result);
		//DOBLE DE CADA VARIABLE
		result=x*2;
		System.out.println("El doble de "+x+" es igual a "+result);
		result=y*2;
		System.out.println("El doble de "+y+" es igual a "+result);
		result=n*2;
		System.out.println("El doble de "+n+" es igual a "+result);
		result=m*2;
		System.out.println("El doble de "+m+" es igual a "+result);
		//SUMA DE TODAS LAS VARIABLES
		result=x+y+n+m;
		System.out.println("La suma de todas las variables seria: "+x+" + "+y+" + "+n+" + "+m+" = "+result);
		//PRODUCTO DE TODAS LAS VARIABLES
		result=x*y*n*m;
		System.out.println("El producto de todas las variables seria: "+x+" * "+y+" * "+n+" * "+m+" = "+result);
	}

}
