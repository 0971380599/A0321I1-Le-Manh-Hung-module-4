package com.example.resort.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    private int customerTypeId;
    @Column(columnDefinition = "VARCHAR(45)")
    private String customerTypeName;
    @OneToMany(mappedBy = "customerType")
    private List<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(int customerTypeId, String customerTypeName, List<Customer> customers) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customers = customers;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
