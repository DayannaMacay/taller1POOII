package com.itsqmet.Taller1.repositorios;

import com.itsqmet.Taller1.entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
