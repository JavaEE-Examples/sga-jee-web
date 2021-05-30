package com.lagm.sga.servicio;

import com.lagm.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/* Esta clase va a ser un EJB de tipo Stateless */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona(1, "Juan", "Perez", "jperez@mail.com", "55139900"));
        listaPersonas.add(new Persona(2, "Martha", "Suarez", "msuarez@mail.com", "55899910"));
        return listaPersonas;
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return null;
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void actualizarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona perrsona) {
    }
    
}
