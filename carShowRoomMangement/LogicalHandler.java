package carShowRoomMangement;

import java.util.List;
import java.util.Map;

public class LogicalHandler {

    CacheLayer cacheLayer=new CacheLayer();
    public void initialiseCities(List<City> cities)throws LogicalException
    {
        if(cities==null||cities.isEmpty())
        {
            throw new LogicalException("Initialise cities list is empty or null",100);
        }
        cacheLayer.setCities(cities);
    }
    public Map<Integer,City> getAllCitiesDetails()
    {
        return cacheLayer.getCityMap();
    }
}
