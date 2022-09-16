package lesson_14.HomeWork;

public class Main {
    public static void main(String[] args) {
        //1. Создаем взвод
        Vzvod vzvod = new Vzvod();
        //2. Создаем экипажи танков
        CrewTank crew1 = new CrewTank("Смелый");
        CrewTank crew2 = new CrewTank("Быстрый");
        CrewTank crew3 = new CrewTank("Меткий");
        //3. Создаем танкистов
        Tankist tankist1 = new Tankist("Петр", 27);
        Tankist tankist2 = new Tankist("Василий", 24);
        Tankist tankist3 = new Tankist("Андрей", 30);
        Tankist tankist4 = new Tankist("Никита", 22);
        Tankist tankist5 = new Tankist("Тимур", 23);
        Tankist tankist6 = new Tankist("Раушан", 21);
        Tankist tankist7 = new Tankist("Гоги", 26);
        Tankist tankist8 = new Tankist("Николай", 22);
        Tankist tankist9 = new Tankist("Марат", 24);
        //4. Добавляем экипажи во взвод
        vzvod.addCrew(crew1);
        vzvod.addCrew(crew2);
        vzvod.addCrew(crew3);
        //5. Добавляем танкистов в экипажи
        vzvod.addStudents(tankist1, "Смелый");
        vzvod.addStudents(tankist2, "Смелый");
        vzvod.addStudents(tankist3, "Смелый");
        vzvod.addStudents(tankist3, "Быстрый");
        vzvod.addStudents(tankist5, "Быстрый");
        vzvod.addStudents(tankist6, "Быстрый");
        vzvod.addStudents(tankist7, "Меткий");
        vzvod.addStudents(tankist8, "Меткий");
        vzvod.addStudents(tankist9, "Меткий");

        System.out.println();
    }

}
