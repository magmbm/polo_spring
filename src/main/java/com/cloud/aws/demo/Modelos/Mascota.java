package com.cloud.aws.demo.Modelos;

public class Mascota {
	Short id, edad;
	String nombre;
	Boolean vacunado;
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public Short getEdad() {
		return edad;
	}
	public void setEdad(Short edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getVacunado() {
		return vacunado;
	}
	public void setVacunado(Boolean vacunado) {
		this.vacunado = vacunado;
	}
}
