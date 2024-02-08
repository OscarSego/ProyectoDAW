package com.pildorasInformaticas.demo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pildorasInformaticas.demo.entidad.Comentario;
import com.pildorasInformaticas.demo.repositorio.ComentarioRepositori;

@Service
public class ComentarioServiceImpl implements ComentarioService {
	
	@Override
	public List<Comentario> listComentario() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Autowired
	private ComentarioRepositori comentarioRepository;
	
    public List<Comentario> getListComentario() {
        return comentarioRepository.findAll();
    }

    public Optional<Comentario> getComentarioById(Long id) {
    	Optional<Comentario> userOptional = comentarioRepository.findById(id);
    	
        if (userOptional.isPresent()) {
            return userOptional;
        } else {
            return null;
        }
    }

    public Comentario saveComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public void deleteComentario(Long id) {
    	comentarioRepository.deleteById(id);
    }

    @Override
    public Comentario updateComentario(Long id, Comentario updatedComentario) {
        Optional<Comentario> existingUserOptional = comentarioRepository.findById(id);

        if (existingUserOptional.isPresent()) {
        	Comentario existingUser = existingUserOptional.get();
            existingUser.setNombre(updatedComentario.getNombre());
            existingUser.setComentario(updatedComentario.getComentario());

            // Guardar el usuario actualizado en la base de datos
            return comentarioRepository.save(existingUser);
        } else {
            // Manejar la lógica cuando el usuario no existe
            // Puedes lanzar una excepción, retornar un valor predeterminado, etc.
            return null;
        }
    }

}
