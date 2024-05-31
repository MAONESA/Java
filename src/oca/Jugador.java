package oca;

public class Jugador {
	private String nombre;
	private int casilla;
	private int turnosRestantes;
	private boolean activo;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.casilla = 0;
		this.turnosRestantes = 0;
		this.activo = true;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCasillas() {
		return casilla;
	}
	public void setCasilla(int casilla) {
		this.casilla = casilla;
	}
	public int getTurnosRestantes() {
		return turnosRestantes;
	}
	public void setTurnosRestantes(int turnosRestantes) {
		this.turnosRestantes = turnosRestantes;
	}
	public boolean isActivo() {
		return activo;
		}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String toString() {
		return "Jugador{"+
				"nombr= '"+nombre + '\''+
				", casilla=" + casilla + 
				",tturnosRestantes=" + turnosRestantes + 
				", activo=" + activo +
				'}';
	}

}
