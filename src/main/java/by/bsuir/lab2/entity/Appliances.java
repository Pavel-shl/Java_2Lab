package by.bsuir.lab2.entity;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Appliances")
@XmlAccessorType(XmlAccessType.FIELD)
public class Appliances implements Serializable {
    @XmlElements({ @XmlElement(name = "Appliance", type = Appliance.class),
            @XmlElement(name = "Laptop", type = Laptop.class), 
            @XmlElement(name = "Teapot", type = Teapot.class),
            @XmlElement(name = "Refrigerator", type = Refrigerator.class),
            @XmlElement(name = "Speakers", type = Speakers.class),
            @XmlElement(name = "TabletPC", type = TabletPC.class),
            @XmlElement(name = "VacuumCleaner", type = VacuumCleaner.class) })
    private List<Appliance> appliances;

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void setAppliances(List<Appliance> appliances) {
        this.appliances = appliances;
    }
}
