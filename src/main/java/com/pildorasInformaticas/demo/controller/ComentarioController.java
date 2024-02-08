package com.pildorasInformaticas.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pildorasInformaticas.demo.entidad.Comentario;
import com.pildorasInformaticas.demo.repositorio.ComentarioRepositori;
import com.pildorasInformaticas.demo.servicio.ComentarioService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/comentario")
public class ComentarioController {
	
	@Autowired
	private ComentarioService comentarioService;
	
    @GetMapping
    public List<Comentario> listComentario() {
        return comentarioService.getListComentario();
    }

    @GetMapping("/{id}")
    public Optional<Comentario> getComentarioById(@PathVariable Long id) {
        return comentarioService.getComentarioById(id);
    }

    @PostMapping
    public Comentario saveComentario(@RequestBody Comentario comentario) {
        return comentarioService.saveComentario(comentario);
    }

    @DeleteMapping("/{id}")
    public void deleteComentario(@PathVariable Long id) {
    	comentarioService.deleteComentario(id);
    }
    
    @PutMapping("/{id}")
    public Comentario updateComentarior(@PathVariable Long id, @RequestBody Comentario updatedComentario) {
        return comentarioService.updateComentario(id, updatedComentario);
    }

}
