package com.cdata.sample;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;


@Provider
@Singleton
@Produces(value = MediaType.APPLICATION_XML)
public class XmlCdataWriter implements MessageBodyWriter {

        @Override
        public boolean isWriteable(Class type, Type genericType, Annotation[] annotations,
                MediaType mediaType) {
                return type.isAnnotationPresent(XmlRootElement.class);
        }

        @Override
        public void writeTo(Object target, Class type, Type genericType, Annotation[] annotations,
                MediaType mediaType, MultivaluedMap httpHeaders, OutputStream entityStream)
                throws IOException, WebApplicationException {

                try {
                        Marshaller m = JAXBContext.newInstance(type).createMarshaller();
                        m.setProperty("com.sun.xml.bind.marshaller.CharacterEscapeHandler", new CdataCharacterEscapeHandler());
                        m.marshal(target, entityStream);
                } catch (JAXBException e) {
                        throw new ProcessingException(
                                "Error serializing a MyBean to the output stream", e);
                }

        }

        @Override
        public long getSize(Object o, Class type, Type genericType, Annotation[] annotations,
                MediaType mediaType) {
                return -1;
        }

}