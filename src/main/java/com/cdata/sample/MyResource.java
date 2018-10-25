package com.cdata.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foo")
public class MyResource {

        @GET
        @Produces(value = MediaType.APPLICATION_XML + "; charset=utf-8")
        public SampleRes foo() {
                SampleRes res = new SampleRes();
                res.setCdataName("<h1>name(with cdata)</h1>");
                res.setName("<h1>name(no cdata)</h1>");
                return res;
        }

}
