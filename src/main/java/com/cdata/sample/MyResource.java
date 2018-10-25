package com.cdata.sample;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Path("/foo")
public class MyResource {

    @GET
    //@Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response get() {
        SampleRes res = new SampleRes();

        List<SampleItem> sampleItemList = new ArrayList<>();

        SampleItem item = new SampleItem();
        item.setCdataName("<h1>name(with cdata)</h1>");
        item.setName("<h1>name(no cdata)</h1>");

        sampleItemList.add(item);

        res.setSampleItemList(sampleItemList);

        return Response.status(Response.Status.OK).encoding(StandardCharsets.UTF_8.name())
                .entity(res).build();
    }

    @POST
    //@Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response post() {
        SampleRes res = new SampleRes();

        List<SampleItem> sampleItemList = new ArrayList<>();

        SampleItem item = new SampleItem();
        item.setCdataName("<h1>name(with cdata)</h1>");
        item.setName("<h1>name(no cdata)</h1>");

        sampleItemList.add(item);

        res.setSampleItemList(sampleItemList);

        return Response.status(Response.Status.OK).encoding(StandardCharsets.UTF_8.name())
                .entity(res).build();
    }
}
