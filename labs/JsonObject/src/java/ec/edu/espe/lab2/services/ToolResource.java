/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab2.services;

import ec.edu.espe.lab2.harswarestore.Tool;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Cristina
 */
@Path("tool")
public class ToolResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ToolResource
     */
    public ToolResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.lab2.services.ToolResource
     * @return an instance of ec.edu.espe.lab2.harswarestore.Tool
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Tool getJson() {
        Tool tool=new  Tool(1,"hammer", (float) 12.3,20,true);
        return tool;
    }

    /**
     * PUT method for updating or creating an instance of ToolResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Tool content) {
    }
}
