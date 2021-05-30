package com.lagm.sga.servicio;

import com.lagm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Remote;

/* @Remote para poder acceder de forma remota a esta clase de servicio */
@Remote
public interface PersonaServiceRemote {
    public List<Persona> listarPersonas();
    public Persona findPersonaById(Persona persona);
    public Persona findPersonaByEmail(Persona persona);
    public void registrarPersona(Persona persona);
    public void actualizarPersona(Persona persona);
    public void eliminarPersona(Persona perrsona);
}
