package com.cdata.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/foo")
public class MyResource {

        @GET
        public SampleRes foo() {
                SampleRes res = new SampleRes();
                res.setCdataName("<h1>name(with cdata)</h1>");
                res.setName("<h1>name(no cdata)</h1>");
                return res;
        }

}
