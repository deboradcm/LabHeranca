package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
	public double raio;
	
	public Circulo (int posX, int posY, double novoRaio){
		super(posX,posY);
		this.posX=posX;
		this.posY=posY;
		this.raio = novoRaio;
		
	}
	
	public double getArea() {
		double A = Math.PI*Math.pow(this.raio,2);
		return A;
		
	}
	
	public double getPerimetro() {
		double C = 2*Math.PI*this.raio;
		return C;
		
	}
	
	public String toString() {
		return ("Círculo na posição (" + this.posX + ", " + this.posY + ") com raio de " + this.raio + "cm (área=" + this.getArea() + "cm2, perímetro=" + this.getPerimetro() + "cm)");
	}

}
