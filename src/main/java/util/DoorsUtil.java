package util;


import model.Doors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DoorsUtil {
    public static List<Doors> getDoorsWithGlass(Collection<Doors> doors,boolean glass){
        List<Doors> doorsList = new ArrayList<>();
        for (Doors door:doors) {
            if (door.isGlass() == true){
                doorsList.add(door);
            }
        }
        return doorsList;
    }

}
