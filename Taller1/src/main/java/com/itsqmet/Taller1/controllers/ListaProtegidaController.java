/*package com.itsqmet.Taller1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ListaProtegidaController {

    // USAR SPRING SECURITY PARA PONERLE CONTRASEÑA AL ENLACE DE LISTA DE USUARIOS
    private static final String PASSWORD = "admin";

    @GetMapping("/lista-protegida")
    public String rutaProtegida(@RequestParam(value = "password", required = false) String password, Model model) {
        if ("admin".equals(password)) {
            return "redirect:/plataforma"; // Contraseña correcta, redirige a la página deseada
        } else {
            model.addAttribute("mensaje", "Contraseña incorrecta");
            return "redirect:/registro-login"; // Contraseña incorrecta, redirige a otra página
        }
    }
}*/

