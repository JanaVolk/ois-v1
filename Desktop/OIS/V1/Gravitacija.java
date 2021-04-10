import java.util.*;

public class Gravitacija{
	
    public static void main(String[]args){

		izracun();
    } 
	public static void izracun(){
		Scanner sc = new Scanner(System.in); 
		
		double v = sc.nextDouble(); 
		double c = 6.674*(Math.pow(10,-11));
		double m = 5.972*(Math.pow(10,24));
        double r = 6.371*(Math.pow(10,6));
		double a = (c*m)/((r+v)*(r+v));
		izpis(v, a);
	}

    public static void izpis(double visina, double pospesek){
        System.out.printf("Podana nadmorska višina je %f, podan gravitacijski pospešek je %f", visina, pospesek);
    }

}
