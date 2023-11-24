package com.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.empleado.Empleado;
import com.empleado.EmpleadoRepositorio;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @GetMapping("/empleados")
    public String listaEmpleados(Model model) {
        Iterable<Empleado> lista = empleadoRepositorio.findAll();
        model.addAttribute("lista", lista);
        return "empleados";
    }
}

