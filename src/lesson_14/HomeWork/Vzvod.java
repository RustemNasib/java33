package lesson_14.HomeWork;

import lesson_14.Student;

import java.util.ArrayList;
import java.util.HashMap;


public class Vzvod {

    private HashMap<CrewTank, ArrayList <Tankist>> vzvod = new HashMap<>();

    public void addCrew(CrewTank crew) {

        vzvod.put (crew, new ArrayList<Tankist>());   // добавили группу с пустым массивом танкистов
    }


    public void addStudents(Tankist tankist, String crewName) {
        CrewTank crew = getCrewByName (crewName);
        ArrayList<Tankist> tankists = vzvod.get(crew);//берем список
        tankists.add(tankist);//добавили танкиста в список
        vzvod.put(crew, tankists); // добавили танкиста во взвод

        }

    private CrewTank getCrewByName(String crewName) {
        for (CrewTank currentCrew: vzvod.keySet()){
            if (currentCrew.getName().equalsIgnoreCase(crewName)){
                return currentCrew;
            }
        }
        return null;
    }
}
