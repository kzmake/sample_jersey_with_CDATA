package com.cdata.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class SampleItem {

    @XmlElement(name = "description")
    @XmlJavaTypeAdapter(value = AdapterCDATA.class)
    private String cdataName;

    @XmlElement(name = "name")
    private String name;

    public String getCdataName() {
        return cdataName;
    }

    public void setCdataName(String cdataName) {
        this.cdataName = cdataName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
