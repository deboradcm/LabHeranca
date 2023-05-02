package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {
	public Quadrado(int posX, int posY, double lado) {
		super(posX,posY,lado, lado);
		this.posX = posX;
		this.posY = posY;
		this.largura = lado;
		this.altura = lado;
		//construtor de retangulo
			
	}
	
	public String toString() {
		return ("Quadrado na posição (" +this.posX +", "+ this.posY +") com lado de " + this.largura +"cm (área=" +this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)");
	}
	
	

}
