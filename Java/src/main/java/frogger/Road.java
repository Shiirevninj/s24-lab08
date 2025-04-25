package frogger;

// Road.java
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isPositionValid(int position) {
        return position >= 0 && position < occupied.length;
    }

    public boolean isPositionOccupied(int position) {
        if (!isPositionValid(position)) {
            return false; // эсвэл exception шидэж болно
        }
        return occupied[position];
    }

    public int getLength() {
        return occupied.length;
    }
}