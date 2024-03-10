package jumper;

import coordinates.Coordinates;

public class Jumper {
    public Coordinates start;
    public Coordinates end;
    public String name;

    public Jumper(Coordinates start, Coordinates end) {
        this.start = start;
        this.end = end;

        if (start.getRow() > end.getRow()) this.name = "Ladder";
        else this.name = "Snake";
    }

    public String getJumperName() {
        return this.name;
    }
}
