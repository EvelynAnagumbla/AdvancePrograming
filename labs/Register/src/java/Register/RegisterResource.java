/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;
import ec.edu.espe.lab3.registerstudent.Register;
import java.util.ArrayList;
import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Cristina
 */
@Path("student")
public class RegisterResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RegisterResource
     */
    public RegisterResource() {
    }

    /**
     * Retrieves representation of an instance of Register.RegisterResource
     * @return an instance of java.lang.String
     */
    
    
    
  
    @Path("{idcourse}/{name}/{deposit}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Register  getRegister(@PathParam("idcourse") String idcourse,@PathParam("name") String name,@PathParam("deposit") float deposit) {
           String instructor="";
           String course="2958";
           String schedule="";
           float cost=0;
           float balance=0;
               Register register=new  Register( name, instructor,  course,  schedule,  cost,  balance);
       if(idcourse.equals(course)){
           register.setInstructor("Edison Lascano");
           register.setSchedule("Lunes y Miercoles 12pm a 14am");
           register.setCost((float) 85.5);
           register.setBalance(deposit);
           register.RegisterDataBase(name, instructor, idcourse+"- Programacion Avanzada", schedule, cost, balance);
       } 
        return register;
    }
@Path("list")
@GET
@Produces(MediaType.APPLICATION_JSON)
public String  getListRegister(){
    Register register=new  Register();
    return register.ListRegisterData();
}
    /**
     * PUT method for updating or creating an instance of RegisterResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
