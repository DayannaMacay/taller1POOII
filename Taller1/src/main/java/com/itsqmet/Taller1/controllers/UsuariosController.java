package com.itsqmet.Taller1.controllers;

import com.itsqmet.Taller1.entidades.Usuarios;
import com.itsqmet.Taller1.repositorios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuariosController {

    @Autowired //Inyectar dependencias al repositorio de empleados
    UsuariosRepository usuariosRepository;

    @GetMapping("/registro-login")
    public String registro_login(Model model){
        model.addAttribute("usuarios", new Usuarios());
        return "registro-login";
    }

    @GetMapping ("/plataforma")
    public String plataforma(){
        return "plataforma";
    }

    @PostMapping("/registro-login")
    public String crear(Usuarios usuarios){
        usuariosRepository.save(usuarios);
        return "redirect:/registro-login";
    }
}
