package org.foobarspam.cotxox.carrera;
import org.foobarspam.cotxox.conductores.*;
import org.foobarspam.cotxox.tarifa.*;

public class Carrera {
	// ---------- Atributos ----------
	private int tiempoEsperado;
	private int tiempoCarrera;
	private double costeTotal;
	private Conductor conductor = new Conductor();
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0;
	private int tiempoEsperadoMinutos = 0;
	
	
	// ---------- Constructores ----------
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}
	
	// ---------- Setters y Getters ----------
	public void setOrigen(String origen){
		this.origen = origen;
	}
	public void setDestino(String destino){
		this.destino = destino;
	}
	public void setTiempoEsperado(int tiempoEsperado){
		this.tiempoEsperadoMinutos = tiempoEsperado;
	}
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	
	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}
	public String getOrigen(){
		return this.origen;
	}
	public String getDestino(){
		return this.destino;
	}
	public double getDistancia(){
		return this.distancia;
	}
	public int getCosteEsperado(){
		return Tarifa.getCosteTotalEsperado();
	}
	
	// ---------- M�todos ----------
}
