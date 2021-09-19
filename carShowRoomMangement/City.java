package carShowRoomMangement;
import java.util.HashMap;
import java.util.Map;
public class City {
    private int cityId;
    private String name;
    private Map<Integer,Branch> branches=new HashMap<>();

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Branch> getBranches() {
        return branches;
    }

    public void setBranches(Branch branch) {
        branches.put(branch.getBranchId(),branch);
    }

    @Override
    public String toString() {
        String print="";
        print+="cityId:"+cityId+"\n";
        print+="name:"+name+"\n";
        print+="Branches:"+branches.toString()+"\n";
       /* return "City{" +
                "cityId=" + cityId +
                ", name='" + name + '\'' +
                ", branches=" + branches +
                '}';*/
        return print;
    }
}
