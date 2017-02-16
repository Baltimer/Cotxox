package org.foobarspam.cotxox.tarifa;

public class Tarifa {
	// ---------- Atributos ----------
	private String id = null;
	private final double costeMilla = 1.35;
	private final double costeMinuto = 0.35;
	private final double porcentajeComision = 20;
	
	// ---------- Constructores ----------
	public Tarifa(){
		
	}
	// ---------- Setters y Getters ----------
	public double getCosteMilla(){
		return this.costeMilla;
	}
	public double getCosteMinuto(){
		return this.costeMinuto;
	}
	public double getPorcentajeComision(){
		return this.porcentajeComision;
	}
	
	// ---------- M�todos ----------
	public double getCosteDistancia(double distancia){
		return distancia * getCosteMilla();
	}
	
	public double getCosteTiempo(int minutos){
		return minutos * getCosteMinuto();
	}
	
	public double getCosteTotalEsperado(double tiempoEsperado, double distanciaEsperada){
		return (tiempoEsperado*getCosteMinuto() * distanciaEsperada * getCosteMilla());
	}
}
