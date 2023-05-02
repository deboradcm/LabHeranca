package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura;
	public double altura;
	
	public Retangulo (int posX, int posY, double novaLargura, double novaAltura){
		super(posX,posY);
		this.posX = posX;
		this.posY = posY;
		this.largura = novaLargura;
		this.altura = novaAltura;
		
	}
	
	public double getArea() {
		double A = this.largura*this.altura;
		return A;
		
	}
	
	public double getPerimetro() {
		double C = 2*(this.largura+this.altura);
		return C;
		
	}
	
	public String toString() {
		return ("Retângulo na posição (" +this.posX +", "+ this.posY +") com largura de " + this.largura +"cm e altura de " + this.altura +"cm (área=" +this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)");
		
	}

}
