package model;


import java.time.LocalDate;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Car {
    
    private String brand;
    private LocalDate manufacturing_date;
    private int numOfSeats;
    private int serialNo;
    private LocalDate maintCertiExpiryDate;
    private String city;
    private String modelNo;
    private String availability;

    
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getManufacturing_date() {
        return manufacturing_date;
    }

    public void setManufacturing_date(LocalDate manufacturing_date) {
        this.manufacturing_date = manufacturing_date;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public LocalDate getMaintCertiExpiryDate() {
        return maintCertiExpiryDate;
    }

    public void setMaintCertiExpiryDate(LocalDate maintCertiExpiryDate) {
        this.maintCertiExpiryDate = maintCertiExpiryDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return ""+serialNo;
    }
    
   
    
}

   /* @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand=" + brand + ", manufacturing_date=" + manufacturing_date + ", numOfSeats=" + numOfSeats + ", serialNo=" + serialNo + ", maintenanceCertificateExpiryDate=" + maintenanceCertificateExpiryDate + ", city=" + city + ", modelNo=" + modelNo + ", availability=" + availability + '}';
    }

    public Car(int id, String brand, LocalDate manufacturing_date, int numOfSeats, long serialNo, LocalDate maintenanceCertificateExpiryDate, String city, String modelNo, String availability) {
        this.id = id;
        this.brand = brand;
        this.manufacturing_date = manufacturing_date;
        this.numOfSeats = numOfSeats;
        this.serialNo = serialNo;
        this.maintenanceCertificateExpiryDate = maintenanceCertificateExpiryDate;
        this.city = city;
        this.modelNo = modelNo;
        this.availability = availability;
    }
    
    */


