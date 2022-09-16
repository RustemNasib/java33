package lesson_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class MainException {
    public static void main(String[] args) {
        /**
         * Иерархия исключительных ситуаций
         *                                        <Object>
         *                                           |
         *             ________________________ <Throwable>___________________________________
         *            |            (Базовый exception, родитель всех exception)              |
         *            |                                                                      |
         *         <Error>                                                              <Exception>
         *   (выпадает не внутри java-кода,                                   (Исключение выпадает внутри
         *   а при выполнении.                                                 java-кода, нужно исключать)
         *   Причина не в программе, а во вне.                           ___________________|
         *                                                              |
         *                                                      <RuntimeException>
         *
         * В итоге методы связанные с ошибками могут содержать в названия трех видов ошибок:
         *      1. error;
         *      2. Exception; <checked (Проверяемый), если среда подчеркивает ошибку и не дает запустить программу, как ошибка синтаксиса>
         *      3. RuntimeException; <unchecked (Непроверяемый), если среда дает запустить программу и ошибка возникает во время выполнения>
         *
         *      Стандартная обработка RuntimeException:
         *          1. Создать объект типовой ошибки;
         *          2. Вызывается у объекта метод вывода на консоль printStackTrace();
         *          3. Выполняется System.exit(0);
         */

        System.out.println("1. Исключительные ситуации");
        System.out.println("1 пример - деление на 0");
        // System.out.println(10/0);
        /*
        1. создан объект ArithmeticException
        2. Вывод сообщения на консоль
        3. System.exit (0)
         */
        // происходит следующий алгоритм
        ArithmeticException arithmeticException = new ArithmeticException();
        arithmeticException.printStackTrace();
        //System.exit (0); //остановить выполнение программы в данном месте
//====================================================================
        System.out.println("2 пример - операция с null");
        String text = null;
       // System.out.println(text.length());
 /*
        1. создан объект класса NullPointerException
        2. Вывод на печать текста ошибки
        3. System.exit (0)
         */

        // происходит следующий алгоритм
        NullPointerException nullPointerException = new NullPointerException();
        nullPointerException.printStackTrace();
        //System.exit (0);
        // ====================================================================
        System.out.println("3 пример - обход ошибок с помощью if");
        String password = null;
        //System.out.println(password.length());
        if (password != null){
          //System.out.println(password.length());
        }
//==============================================================================
        int number = Integer.parseInt("d12");
        System.out.println(number);
        //==============================================================================
        try {
            Files.copy(new File("D:/папка1/123.gpg").toPath(),new File("D:/папка2/123.gpg").toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //==============================================================================
        try {
            Files.copy(new File("D:/папка1/123.gpg").toPath(),new File("D:/папка2/123.gpg").toPath());
        } catch (NoSuchFileException e) {
            System.out.println("Файл закрыт для чтения");
        }catch (FileNotFoundException e) {
            System.out.println("Файл отсутствует!");
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println("чо-то пошло не так!");
        }finally {
            //сделать запись в журнал событий
            System.out.println("Запись в журнал");
        }
        System.out.println("Программа продолжается");
        //==============================================================================
        int a = 4;
        if (a<5){
            throw new NullPointerException();
        }else {
            System.out.println("все ОК");
        }

    }
}
