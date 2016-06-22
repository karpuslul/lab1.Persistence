package persistenceDemo.Entity;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Column(name = "country", table = "country", nullable = false, length = 50)
    @Basic
    private String country;

    @Column(name = "last_update", table = "country", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @OneToMany(targetEntity = City.class, mappedBy = "countryId")
    private List<City> cityCollection;

    @Column(name = "country_id", table = "country", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short countryId;

    public Country() {

    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<City> getCityCollection() {
        return this.cityCollection;
    }

    public void setCityCollection(List<City> cityCollection) {
        this.cityCollection = cityCollection;
    }

    public Short getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }
}