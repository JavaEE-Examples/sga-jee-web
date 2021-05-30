package com.lagm.sga.web;

import com.lagm.sga.domain.Persona;
import com.lagm.sga.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
    /* Notacion @Inject es parte del API CDI (Context Dependency Injection) permite inyectar componentes. En este caso 
    para poder tener disponible una instancia del EJB Local por medio de la interfaz local PersonaService */
    @Inject
    PersonaService personaServiceEJB;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Se invoca el método del EJB que retorna las personas
        List<Persona> listaPersonas = personaServiceEJB.listarPersonas();
        System.out.println("Personas: " + listaPersonas);
        
        // Se pone la lista de personas en el alcance de la variable request
        request.setAttribute("personas", listaPersonas);
        
        /* Se redirige hacia el jsp "listadoPersonas.jsp" que va a mostrar el listado de personas.
         Se reenvía también el objeto response y request para poder acceder a la información del request donde se seteó el atributo personas */
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
