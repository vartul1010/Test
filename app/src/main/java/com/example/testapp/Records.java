package com.example.testapp;

public class Records
{
    private String states_uts;

    private String numbers_of_projects;

    public String getStates_uts ()
    {
        return states_uts;
    }

    public void setStates_uts (String states_uts)
    {
        this.states_uts = states_uts;
    }

    public String getNumbers_of_projects ()
    {
        return numbers_of_projects;
    }

    public void setNumbers_of_projects (String numbers_of_projects)
    {
        this.numbers_of_projects = numbers_of_projects;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [states_uts = "+states_uts+", numbers_of_projects = "+numbers_of_projects+"]";
    }
}