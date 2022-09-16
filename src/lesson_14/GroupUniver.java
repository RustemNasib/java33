package lesson_14;

public class GroupUniver {

    private String name;

    public GroupUniver(String name) {
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
