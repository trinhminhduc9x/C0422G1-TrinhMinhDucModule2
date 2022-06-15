package Ss7_Abstract_and_interface.exercise.interfac_resizeable;

import java.util.Comparator;

public abstract class Shape implements Resizeable, Comparable<Square> {
    private String color = " green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled()?"fillesd":"not filled");
    }

    @Override
    public void resizeable(double percent) {
        System.out.println("tang ti le " + percent);
    }
    @Override
    public int compareTo(Square o) {
        return 0;
    }

}
