package carShowRoomMangement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheLayer {
    private Map<Integer,City> cityMap=new HashMap<>();

    public void setCities(List<City> cities)
    {
        for(City city:cities)
        {
            cityMap.put(city.getCityId(),city);
        }
    }
    public Map<Integer,City> getCityMap()
    {
        return cityMap;
    }
}
