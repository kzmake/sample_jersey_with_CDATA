package com.cdata.sample;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SampleRes {

        @XmlJavaTypeAdapter(AdapterCDATA.class)
        private String cdataName;

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
