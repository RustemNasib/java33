package lesson_14;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Пример: Один ключ, много значений. Ключ группа, значение Ученики с данными: ФИО, возраст, пол
         * Потребуется:
         * Тип данных: "Ученик" (Student) входит в "Группа" (Group) входит в "Университет" (University)
         *                 ______________University1_______________                          Коллекция
         *    __________Group1_________               __________Group2_________              Ключ
         *    [Student1  Student2  Student3]        [Student4  Student5  Student6]           Значение
         */

        // 1. Создать объект Универ
        University university = new University();
        // 2. Создать группы
        GroupUniver group1 = new GroupUniver("ФизМат");
        GroupUniver group2 = new GroupUniver("ИнЯз");
        // 3. Создать студентов
        Student ivan = new Student ("ivan", 18, true);
        Student ira = new Student ("ira", 19, false);
        Student ignat = new Student ("ignat", 21, true);
        Student egor = new Student ("ivan", 18, true);
        Student oleg = new Student ("ivan", 28, true);

        // 4. Добавляем группы в университет
        university.addGroup (group1);
        university.addGroup (group2);

// 5. Добавим студентов в группу университета
        university.addStudents(ivan, "ФизМат");
        university.addStudents(ira, "ФизМат");
        university.addStudents(ignat, "ИнЯз");
        university.addStudents(egor, "ИнЯз");

        university.addStudents(oleg, "Devops");


    }
}
//Домашняя работа
/**
 * Реализуйте в программе классы и метода аналогично решенной задачи:
 * Дано:  "Танковый взвод" в который входят 3 танковых экипажа, в каждом экипаже по 3 танкиста (ФИО, возраст, пол)
 *
 *                  ______________Танковый взвод_________________________________________               Коллекция
 *                 |                                |                                   |
 *    _________1 Экипаж танка______    ______2 Экипаж танка______     ______3 Экипаж танка______        Ключ
 *    [tankist1 tankist2 tankist3]   tankist4 tankist5 tankist6]    [tankist7 tankist8 tankist9]       Значение
 */