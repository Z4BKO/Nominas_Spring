package com.empleado;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Integer> {
	Empleado findByDni(String dni);
	
	List<Empleado> findByNombre(String nombre);
	List<Empleado> findAllBySexo(String sexo);
	List<Empleado> findAllByCategoria(int i);
	List<Empleado> findAllByAnyos(int anyos);
	
	
}