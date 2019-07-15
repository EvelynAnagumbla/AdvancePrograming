/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
@Path("notas")
/**
 * REST Web Service
 *
 * @author Cristina
 */


public class Persona {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Persona
     */
    public Persona() {
    }

    /**
     * Retrieves representation of an instance of notas.Persona
     * @return an instance of java.lang.String
     */
    @Path("persona")
    @GET
    @Produces(MediaType.TEXT_PLAIN)//tipo de dato q se produce (.json,.xml)
    
   
    public String getPersonData() {
        //TODO return proper representation object
        
        //throw new UnsupportedOperationException();
       
        return "Anagumbla ";
    }
    @Path("{lastname}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
     public String getGrade(@PathParam("lastname") String lastname) {    
         String i="";
         if(lastname.equals("Lascano")){
        i= "10";
         }
         if(lastname.equals("Anagumbla")){
          i="20";
         }
        return i;
    }
    /**
     * PUT method for updating or creating an instance of Persona
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putPersonData(String content) {
       // return "ANAGUMBLA";
    }
}
