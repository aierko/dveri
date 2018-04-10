package model;

public class Doors extends AbstractBaseEntity {
    private int doors = 0;
    private int doorHand = 0;
    private String doorColor;
    private boolean glass;


    public Doors(int doors, int doorHand, String color, boolean glass) {
        this.doors = doors;
        this.doorHand = doorHand;
        this.doorColor = color;
        this.glass = glass;
    }

    public int getDoors() {
//        List<String> list = new ArrayList<>();
//        list.add("werfwefwefr");
//        list.add("sdfwerasdsaf");
//        StringBuffer s = new StringBuffer();
//        s.append(list.get(0));
//        s.append(list.get(1));
     return doors;

    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoorHand() {
        return doorHand;
    }

    public void setDoorHand(int doorHand) {
        this.doorHand = doorHand;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public boolean isGlass() {
        return glass;
    }

    public void setGlass(boolean glass) {
        this.glass = glass;
    }

    @Override
    public String toString() {
        return "Door{" +
                " doors= " + doors +
                ", doorHand= " + doorHand +
                ", doorColor= " + doorColor + '\'' +
                ", glass= " + glass;

    }
}

