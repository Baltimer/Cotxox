package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class PoolConductores {
	// ---------- Atributos ----------
	ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	// ---------- Constructores ----------
	public PoolConductores(ArrayList<Conductor> conductores){
		for (Conductor conductor : conductores){
			this.poolConductores.add(conductor);
		}
	}
	// ---------- Setters y Getters ----------
	public ArrayList<Conductor> getPoolConductores(){
		return this.poolConductores;
	}
	
	// ---------- Métodos ----------
	public void asignarConductor(){
		
	}
}
