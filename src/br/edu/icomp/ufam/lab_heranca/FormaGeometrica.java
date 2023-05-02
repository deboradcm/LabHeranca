package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {
	public int posX;
	public int posY;
	
	public FormaGeometrica (int novaPosX, int novaPosY){
		this.posX = novaPosX;
		this.posY = novaPosY;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	public String getPosString() {
		return ("posição (" + this.posX +", "+ this.posY);
	}

}
