package com.cdata.sample;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "SampleResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SampleRes {

    @XmlElementWrapper(name = "sampleSet")
    @XmlElement(name = "item")
    private List<SampleItem> sampleItemList;

    public void setSampleItemList(List<SampleItem> sampleItemList) {
        this.sampleItemList = new ArrayList<>(sampleItemList);
    }

    public List<SampleItem> getSampleItemList() {
        return new ArrayList<>(sampleItemList);
    }

}
