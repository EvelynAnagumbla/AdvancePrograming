/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
@Path("datos")
public class caso1 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of caso1
     */
    public caso1() {
    }

    /**
     * Retrieves representation of an instance of Operaciones.caso1
     *
     * @return an instance of java.lang.String
     */
//    @Path("Datos")
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getSolucion() {
//        //TODO return proper representation object
//        return "opercxkfdf";
//    }
    @Path("{size}/{mean}/{variance }")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIntervalo(@PathParam("size") float size, @PathParam("mean") float mean, @PathParam("variance") float variance) {
        float intersuper, interinfer;
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato1 = new DecimalFormat("#.0000", separadoresPersonalizados);
        intersuper = (float) (mean + 1.96 * (variance  / Math.sqrt(size)));
        interinfer = (float) (mean - 1.96 * (variance  / Math.sqrt(size)));
        System.out.println("dsds");
        String msj = "\n " + "Datos: n=tamanio de poblacion="+size + "\n\t " + "m=media=" +mean+ "\n\t " + "s=varianza="+variance + "\n\t " + "t=normal=1.06" + "\n\t",
                frm = "FROMULA= m +- t*(s/sqrt(n))" + "\n ";

        return "INTERVALO DE CONFIANZA" + msj + frm + "RESUTADO:[" + formato1.format(interinfer) + ";" + formato1.format(intersuper) + "]";
    }

    /**
     * PUT method for updating or creating an instance of caso1
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putSolucion(String content) {
    }
}
