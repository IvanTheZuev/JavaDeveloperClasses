package com.schneider.project.lesson08;

public class RepairShop {
    private CarMegan[] carMegans;

    public void addToCarMegan(CarMegan carMegan){
        
    }

    public void repairAll(){
        for(CarMegan vehicle : carMegans){
            vehicle.repair();
        }

    }
}
