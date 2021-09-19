package carShowRoomMangement;
import java.util.*;
public class CarShowRoomManagementSystem {
    public static void main(String[] args) throws LogicalException {
        LogicalHandler logicalHandler=new LogicalHandler();
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to show room management system");
        int cityId=1;
        int branchId=1;
        List<City> cities=new ArrayList<>();
        System.out.println("Enter the no of cites");
        int noOfCities=sc.nextInt();
        for(int i=0;i<noOfCities;i++) {
            System.out.println("enter city name");
            String cityName = sc.next();
            City city = getCity(cityId++, cityName);
            System.out.println("enter the no of branches");
            int branches = sc.nextInt();
            for (int j = 0; j < branches; j++) {
                System.out.println("enter branch name");
                String name = sc.next();
                Branch branch = getBranch(branchId++, name);
                city.setBranches(branch);
            }
            cities.add(city);
        }
        logicalHandler.initialiseCities(cities);
        Map<Integer,City> map=logicalHandler.getAllCitiesDetails();
        System.err.println(map);

    }
    private static City getCity(int cityId,String cityName)
    {
        City city=new City();
        city.setCityId(cityId);
        city.setName(cityName);
        return city;
    }
    private static Branch getBranch(int branchId,String branchName) {
        Branch branch = new Branch();
        branch.setBranchId(branchId);
        branch.setName(branchName);
        branch.setAvailableCars(1,5);
        branch.setAvailableCars(2,5);
        branch.setSoldCars(1,0);
        branch.setSoldCars(2,0);
        return branch;
    }
}
