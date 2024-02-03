package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double soulde;
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double soulde, Date dateCreation) {
        this.code = code;
        this.soulde = soulde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSoulde() {
        return soulde;
    }

    public void setSoulde(double soulde) {
        this.soulde = soulde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
