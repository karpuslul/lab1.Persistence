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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "store")
//@Table(name = "store", uniqueConstraints = @UniqueConstraint(columnNames = {"manager_staff_id"}))
public class Store implements Serializable {

    @OneToMany(targetEntity = Customer.class, mappedBy = "storeId")
    private List<Customer> customerCollection;

    @OneToMany(targetEntity = Inventory.class, mappedBy = "storeId")
    private List<Inventory> inventoryCollection;

    @Column(name = "last_update", table = "store", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @OneToMany(targetEntity = Staff.class, mappedBy = "storeId")
    private List<Staff> staffCollection;

    @Column(name = "store_id", table = "store", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short storeId;

    @ManyToOne(optional = false, targetEntity = Address.class)
    @JoinColumn(name = "address_id")
    private Address addressId;

    @OneToOne(optional = false, targetEntity = Staff.class, mappedBy = "store")
    @JoinColumn(name = "manager_staff_id")
    private Staff managerStaffId;

    public Store() {

    }

    public List<Customer> getCustomerCollection() {
        return this.customerCollection;
    }

    public void setCustomerCollection(List<Customer> customerCollection) {
        this.customerCollection = customerCollection;
    }

    public List<Inventory> getInventoryCollection() {
        return this.inventoryCollection;
    }

    public void setInventoryCollection(List<Inventory> inventoryCollection) {
        this.inventoryCollection = inventoryCollection;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Staff> getStaffCollection() {
        return this.staffCollection;
    }

    public void setStaffCollection(List<Staff> staffCollection) {
        this.staffCollection = staffCollection;
    }

    public Short getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Short storeId) {
        this.storeId = storeId;
    }

    public Address getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Staff getManagerStaffId() {
        return this.managerStaffId;
    }

    public void setManagerStaffId(Staff managerStaffId) {
        this.managerStaffId = managerStaffId;
    }
}
