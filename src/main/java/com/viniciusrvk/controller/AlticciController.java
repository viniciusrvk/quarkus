package com.viniciusrvk.controller;

import com.viniciusrvk.service.CalculadoraService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciController {

    private CalculadoraService calculadoraService = new CalculadoraService();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{n}")
    public Integer hello(@PathParam("n") Integer n) {
        return calculadoraService.calcular(n);
    }
}