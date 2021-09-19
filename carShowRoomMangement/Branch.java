package carShowRoomMangement;

import java.util.HashMap;
import java.util.Map;

public class Branch {
    private int branchId;
    private String name;
    private Map<Integer,Integer> availableCars=new HashMap<>();
    private Map<Integer,Integer> soldCars=new HashMap<>();

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Integer> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(int carId,int noOfCars) {
        availableCars.put(carId,noOfCars);
    }

    public Map<Integer, Integer> getSoldCars() {
        return soldCars;
    }

    public void setSoldCars(int carId,int noOfCars) {
        soldCars.put(carId,noOfCars);
    }

    @Override
    public String toString() {
        String print="";
        System.out.println("----------------------");
        print+="BranchId:"+"\t"+"BranchName"+"\n";
        print+=branchId+"\t"+name+"\n";
        print+="Available cars....."+"\n";
        print+="CarId:"+"\t"+"NOofCars"+"\n";
        /*return "Branch{" +
                "branchId=" + branchId +
                ", name='" + name + '\'' +
                ", availableCars=" + availableCars +
                ", soldCars=" + soldCars +
                '}';*/
        return print;
    }
}
