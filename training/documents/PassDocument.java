package documents;

import annotations.json.JsonField;
import annotations.json.JsonPrintable;
import annotations.xml.XmlPrintable;
import annotations.xml.XmlField;

import java.util.Date;

@JsonPrintable
@XmlPrintable
public class PassDocument {

    @JsonField(mapping = "ANUN", count = 6)
    @XmlField(mapping = "IMYA")
    private String name;

    @JsonField
    private String midName;
    private String surname;

    @JsonField(mapping = "ANDZNAGIR")
    private String passportId;

    private String address;

    private Date validFrom;

    private Date validTo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
}
