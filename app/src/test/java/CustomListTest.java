import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("edmonton","ab");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City c = new City("edmonton","ab");
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }

    @Test
    public void deleteCityTest(){
        City c = new City("edmonton","ab");
        list.addCity(c);
        assertTrue(list.hasCity(c));
        list.deleteCity(c);
        assertFalse(list.hasCity(c));
    }

    @Test
    public void countCitiesTest(){
        City c = new City("edmonton","ab");
        assertEquals(0,list.countCities());
        list.addCity(c);
        assertEquals(1,list.countCities());
    }
}
