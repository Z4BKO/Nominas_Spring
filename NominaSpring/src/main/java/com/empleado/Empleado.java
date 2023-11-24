package com.empleado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="dni")
    private String dni;

    @Column(name="sexo")
    private String sexo;

    @Column(name="categoria")
    private int categoria;

    @Column(name="anyos")
    private int anyos;

	public Empleado(int id, String nombre, String dni, String sexo, int categoria, int anyos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.categoria = categoria;
		this.anyos = anyos;
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

}