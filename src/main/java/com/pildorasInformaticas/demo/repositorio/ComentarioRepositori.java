package com.pildorasInformaticas.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pildorasInformaticas.demo.entidad.Comentario;

@Repository
public interface ComentarioRepositori extends JpaRepository<Comentario, Long>{

}
