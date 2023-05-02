package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main (String args[]) {
		Circulo circulo1 = new Circulo(2,2,2);
		Retangulo retangulo1 = new Retangulo(2,2,2,2);
		Quadrado quadrado1 = new Quadrado(2,2,2);
		
		FormaGeometrica formas[] = new FormaGeometrica[3];
		formas[0] = circulo1;
		formas[1] = retangulo1;
		formas[2] = quadrado1;
		
		for (var i = 0; i<formas.length;i++) {
		
			System.out.println(formas[i]);
		}
		
	}
		
		

}
