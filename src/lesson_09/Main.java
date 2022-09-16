package lesson_09;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        /**
         * ООП - объектно-ориентированное программирование. Основные принципы:
         *  1. Инкапсуляция - область видимости, реализована через модификаторы доступа:
         *      public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случаев используется);
         *      protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте;
         *      ______ - будет доступен только внутри текущего пакета (текущей папки);
         *      private - только внутри текущего класса (файла);
         *   2. Наследование - extends — это механизм, который позволяет создавать классы на основе
         *      других классов наследую их методы в дочерних (подчиненных) классах.
         *   3. Абстракция - означает выделение главных, наиболее значимых характеристик предмета и
         *      наоборот — отбрасывание второстепенных, незначительных.
         *   4. Полиморфизм - это способность программы идентично использовать объекты с одинаковым
         *      интерфейсом без информации о конкретном типе этого объекта. Мы можем работать со
         *      многими типами, как с одним (при условии, что эти типы являются производными (дочерними)
         *      от базового (разового) типа).
         *
         *
         */

        /**
         * Вы работаете над программой-каталогом домашней медиа-библиотеки
         * фильмов и музыкальных альбомов на DVD дисках (образах).
         * 1. Разобрать классы для хранения информации о:
         *      - музыкальных альбомах (название альбома, исполнитель, год издания, количество треков)
         *      - фильмах (название, год выхода, студия издатель, режиссер, продолжительность в минутах)
         * 2. Создать массив дисков с неоднородным составом (фильма и музыкальные диски),
         *      заполнить его несколькими элементами, вывести все элементы на экран.
         * 3. Найти в массиве самый старый диск (printOldestMedia) и вывести информацию о нем на экран.
         * 4. Пояснить, где и зачем в данной программе используется полиморфизм
         */

        //создаем объекты аудио и видео конкретных продуктов
        DiskVideo film1 = new DiskVideo();
        film1.setName("Зеленая миля");
        film1.setYear(2000);
        film1.setDirector("Директор1");
        film1.setStudio("Каламбия1");
        film1.setMis(190);

        DiskVideo film2 = new DiskVideo();
        film2.setName("Терминатор");
        film2.setYear(1990);
        film2.setDirector("Директор2");
        film2.setStudio("Каламбия2");
        film2.setMis(150);

        DiskAudio audio1 = new DiskAudio();
        audio1.setName("Руки вверх");
        audio1.setAuthor("Сергей Жуков");
        audio1.setCountOfTrack(12);
        audio1.setYear(1997);

        DiskAudio audio2 = new DiskAudio();
        audio2.setName("Цой");
        audio2.setAuthor("Виктор");
        audio2.setCountOfTrack(15);
        audio2.setYear(1987);
        System.out.println();

        // созданные медиа продукты складываем в родительский массив
        MediaProduct[] medias = new MediaProduct[4];
        medias[0] = film1;
        medias[1] = film2;
        medias[2] = audio1;
        medias[3] = audio2;

        // распечатать массив медиа
        for (MediaProduct product : medias) {
            product.printAllInfo(); // проявление полиморфизма
        }
ServiceUtilities.printOldestMedia (medias);


    }
}
