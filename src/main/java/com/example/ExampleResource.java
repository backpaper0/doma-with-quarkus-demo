package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @javax.inject.Inject
    ExampleDao dao;

    @javax.inject.Inject
    Bar bar;
    @javax.inject.Inject
    Baz baz;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "DataSource: " + bar.getDataSource() + ", DAO: " + dao + ", bar: " + bar + ", baz: " + baz;
    }
}
