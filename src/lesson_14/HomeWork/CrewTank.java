package lesson_14.HomeWork;

import java.util.ArrayList;

public class CrewTank {
    private String name;


    public CrewTank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printToConsole(){
        System.out.println(name);
    }


}
