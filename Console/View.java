import java.util.Scanner;

import Homework.JAVA_OOP.Console.ConsoleInterface.InterMenuRN;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterPrint;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterPrintArray;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterPrintln;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterShow;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterShowRN;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterValueDou;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterValueInt;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterValueRN;
import Homework.JAVA_OOP.Console.ConsoleInterface.InterValueStr;
import Homework.JAVA_OOP.Console.ConsoleMethod.InputRN;
import Homework.JAVA_OOP.Console.ConsoleMethod.OutputRN;
import Homework.JAVA_OOP.Model.ModelLogger.LoggerMP;

public class View implements InterValueDou,InterValueInt,InterValueStr,InterValueRN,InterPrintln,
InterShow,InterShowRN,InterPrint,InterPrintArray,InterMenuRN {

    LoggerMP log = new LoggerMP();

    Scanner scanner = new Scanner(System.in);

    InputRN inRN = new InputRN();

    OutputRN outRN = new OutputRN();

    // --------------------- Ввод данных в консоль--------------------------//

    /**
     * Ввод данных в формате double
     * 
     * @param text - текст для вывода в консоль
     * @return
     */
    @Override
    public Double getValueDou(String text) {
        System.out.print(text);
        return scanner.nextDouble();
    }

    /**
     * Ввод данных в формате Integer
     * 
     * @param text - текст для вывода в консоль
     * @return
     */
    @Override
    public Integer getValueInt(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }

    /**
     * Ввод данных в формате String
     * 
     * @param text - текст для вывода в консоль
     * @return
     */
    @Override
    public String getValueStr(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }

    /**
     * Ввод рациональных чисел в формате String в виде: a m/n, m/n, a.
     * Где a - целое число, m - числитель, n- знаменатель.
     * 
     * @param text - ввод комментариев, которые будут выводиться в консоль
     * @return - возвращает массив в виде [m,a]
     */
    @Override
    public Integer[] getValueRN(String data) {
        inRN.setRN(data);

        return inRN.getRN();
    }

    // ----------------------- Вывод данных в консоль ---------------------------///

    /**
     * Вывод данных в консоль
     * 
     * @param value - данные в виде double
     * @param data  - данные в виде String - комментарии
     */
    @Override
    public void show(Double value, String data) {
        System.out.printf("%s %f\n", data, value);

    }

    /**
     * Вывод данных c рациональным числом.
     * 
     * @param value - данные в виде Integer [m,n]
     * m - числитель, n- знаменатель.
     * @param text  - данные в виде String
     */
    @Override
    public String showRN(Integer[] value, String text) {

        outRN.setRN(value);

        String outData = outRN.getRN();

        System.out.println(text + outData);

        return outData;

    }

    /**
     * Вывод данных в консоль с переносом на следующую строку
     * 
     * @param text
     */
    @Override
    public void println(String text) {
        System.out.println(text);
    }

    /**
     * Вывод данных в консоль без переноса на следующую строку
     * 
     * @param text
     */
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    /**
     * Вывод данных массива в консоль
     */
    @Override
    public void printArray(Integer[] array) {
        System.out.print("[ ");
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1)
                System.out.print(array[index].toString() + ",");
            else
                System.out.print(array[index].toString() + " ]\n");

        }
    }

    // ---------------------- Работа с интерфейсом консоли в программе -------//
    /**
     * Вывод в консоль операций калькулятора для Рациональных чисел
     * 
     * @return - выбор типа действий
     */
    @Override
    public Integer MenuRN() {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("Математические операции с натуральными числами\n")
                .append("1 - Сложение 2-х чисел\n")
                .append("2 - Разность 2-х чисел\n")
                .append("3 - Произведение 2-х чисел\n")
                .append("4 - Деление первого числа на второе чисел\n")
                .append("0 - exit\n");

        println(sb.toString());

        Integer temp = getValueInt("Введите число от 0 до 4: ");
        log.setLogger("Пользователь ввёл число при выборе математической операции : " + temp.toString());
        return temp;

    }

}
