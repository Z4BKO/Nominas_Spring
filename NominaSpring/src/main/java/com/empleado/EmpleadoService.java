package com.empleado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;

	public EmpleadoRepositorio getempleadoRepositorio() {
		return empleadoRepositorio;
	}

	public void setempleadoRepositorio(EmpleadoRepositorio empleadoRepositorio) {
		this.empleadoRepositorio = empleadoRepositorio;
	}

	public List<Empleado> listarTodos() {
		return (List<Empleado>) empleadoRepositorio.findAll();
	}

	public void guardarEmpleado(Empleado empleado) {
		empleadoRepositorio.save(empleado);
	}

	public void eliminarEmpleado(int id) {
		empleadoRepositorio.deleteById(id);
	}

	public Empleado findByDni(String dni) {
		return empleadoRepositorio.findByDni(dni);
	}

	public Empleado findById(int id) {
		return empleadoRepositorio.findById(id).orElse(null);
	}

	public List<Empleado> findNombreParameters(String opcion, String valor) {
		List<Empleado> empleados = new ArrayList<>();
		switch (opcion) {
		case "nombre":
			empleados = empleadoRepositorio.findByNombre(valor);
			break;
		case "dni":
			if (valor.matches("\\d{8}[A-Z]")) {
				empleados.add(empleadoRepositorio.findByDni(valor));
			}
			break;
		case "sexo":
			empleados = empleadoRepositorio.findAllBySexo(valor);
			break;
		case "categoria":
			empleados = empleadoRepositorio.findAllByCategoria(Integer.parseInt(valor));
			break;
		case "anyos":
			empleados = empleadoRepositorio.findAllByAnyos(Integer.parseInt(valor));
			break;
		}
		return empleados;
	}

}