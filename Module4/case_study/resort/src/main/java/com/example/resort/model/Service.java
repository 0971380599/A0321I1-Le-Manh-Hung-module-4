package com.example.resort.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;
    @Column(columnDefinition = "VARCHAR(45)")
    private String serviceName;
    private int serviceArea;
    private Double serviceCost;
    private int serviceMaxPeople;
    @ManyToOne(targetEntity = ServiceType.class)
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;
    @OneToMany(mappedBy = "service")
    private List<Contract> contracts;
    @ManyToOne(targetEntity = RentType.class)
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;
    @Column(columnDefinition = "VARCHAR(45)")
    private String standardRoom;
    @Column(columnDefinition = "VARCHAR(45)")
    private String  descriptionOtherConvenience;
    private Double poolArea;
    private int numberOfFloors;

    public Service() {
    }

    public Service(int serviceId, String serviceName, int serviceArea, Double serviceCost, int serviceMaxPeople, ServiceType serviceType, List<Contract> contracts, RentType rentType, String standardRoom, String descriptionOtherConvenience, Double poolArea, int numberOfFloors) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.serviceType = serviceType;
        this.contracts = contracts;
        this.rentType = rentType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
