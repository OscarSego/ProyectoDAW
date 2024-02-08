package com.pildorasInformaticas.demo.servicio;

import java.util.List;
import java.util.Optional;

import com.pildorasInformaticas.demo.entidad.Comentario;

public interface ComentarioService {
	
	public List<Comentario> listComentario();

	public Optional<Comentario> getComentarioById(Long id);

	public Comentario saveComentario(Comentario user);

	public void deleteComentario(Long id);

	public List<Comentario> getListComentario();

	Comentario updateComentario(Long id, Comentario updatedUser);



}
