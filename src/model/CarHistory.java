/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CarHistory {
    
    private ArrayList<Car> carList;
    
    public CarHistory(){
        
        this.carList = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public void addNewCars(Car c){
        //Car newCars = new Car();
        carList.add(c);
        //return newCars;
    }
    
    public Car getCarbySerialNo(int serialNo){
       return carList.get(serialNo);
      
    }
    public void updateNewCars(int serialNo, Car c){
        carList.set(serialNo, c);
    }
    
    public void deleteCars(Car c){
        carList.remove(c);
    }

    
}
