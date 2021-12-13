package mx.edu.utez.controller;

import mx.edu.utez.model.categoria.Categoria;
import mx.edu.utez.model.categoria.DaoCategoria;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

@Path("/categoria")
public class ServicioCategoria {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categoria> getCategoria(){
        return new DaoCategoria().findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Categoria getCategoriaById(@PathParam("id") int id){
        return new DaoCategoria().findCategoriaById(id);
    }


}
