package wall;

import java.util.ArrayList;

public class Wall {
    private int row = 0;
    private int column = 0;
    private int value = 0;
    public static String OCCUPIED_IN_X = "*";
    public static String OCCUPIED_IN_Y = "*";
    public static int NOT_OCCUPIED = 0;


    public Wall(int row, int column) {
        this.row = row;
        this.column = column;
        this.value = Wall.NOT_OCCUPIED;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
            return value;
    }
    public boolean rowX(){
        if (this.value == NOT_OCCUPIED){
            this.value = OCCUPIED_IN_X;
            return true;
        }
        return false;
    }


    public String toString() {
        switch (this.value) {
            case Wall.OCCUPIED_IN_X: return "x";
            case Wall.OCCUPIED_IN_Y: return "y";
            default: return "";
        }
    }
}