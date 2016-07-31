package com.aupadhyay.cresendo;

/**
 * Created by aupadhyay on 7/22/16.
 */
public class ContestantDetails {

    private String name;
    private float marks;

    public ContestantDetails(String name, float marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName()
    {
        return name;
    }
    public float getMarks()
    {
        return marks;
    }

    @Override
    public String toString() {
        return String.format("Name =%s And Marks = %s", name, marks);

    }
}
