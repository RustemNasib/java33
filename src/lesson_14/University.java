package lesson_14;

import java.util.ArrayList;
import java.util.HashMap;

public class University {
    private HashMap<GroupUniver, ArrayList<Student>> university = new HashMap<>();

    public void addGroup(GroupUniver group) {
        if (university.containsKey(group)) {
            System.out.println("Такая группа уже есть!");
        } else {
            university.put(group, new ArrayList<Student>());// добавили группу с пустым массивом студентов
        }

    }

    public void addStudents(Student student, String groupName) {//добавляем студентов
        if (isHasGroup(groupName)) { //если существует группа
            GroupUniver group = getGroupByName(groupName);
            ArrayList<Student> students = university.get(group); // вытаскиваем список
            students.add(student);//добавили студента
            university.put(group, students);//добавляем в группу новый список студентов

        } else { //иначе создается другая группа
            GroupUniver group = new GroupUniver(groupName);//создали новую группу
            ArrayList<Student> students = new ArrayList<>();//получили новый список
            students.add(student);//добавили студента
            university.put(group, students); // добавляем в универ
        }
    }
    private GroupUniver getGroupByName(String groupName) {
        for (GroupUniver currentGroup: university.keySet()){
            if (currentGroup.getName().equalsIgnoreCase(groupName)){
                return currentGroup;
            }
        }
        return null;
    }

    private boolean isHasGroup(String groupName) {
        for (GroupUniver currentGroup : university.keySet()) {
            if (currentGroup.getName().equalsIgnoreCase(groupName)) {
                return true;
            }

        }
        return false;
    }
}
