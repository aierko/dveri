package to;

import java.time.LocalDateTime;

public class DoorsWithOrder {
    private final Integer id;

    private final LocalDateTime dateTime;

    private int doors = 0;
    private int doorHand = 0;
    private String doorColor;
    private boolean glass;

    public DoorsWithOrder(Integer id, LocalDateTime dateTime, int doors, int doorHand, String doorColor, boolean glass) {
        this.id = id;
        this.dateTime = dateTime;
        this.doors = doors;
        this.doorHand = doorHand;
        this.doorColor = doorColor;
        this.glass = glass;

    }
}
