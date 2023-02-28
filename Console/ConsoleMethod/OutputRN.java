import java.lang.reflect.Array;
import java.util.ArrayList;

public class OutputRN {

    /**
     * Нахождение простых чисел решетом Эратосфена
     * 
     * @param number - число, до которого будут искаться натуральные числа
     * @return - возвращает массив натуральных чисел
     */
    private static Integer[] PrimeNumbers(Integer number) {

        Integer[] numberAr = new Integer[number - 1];

        Integer sum = 0;

        for (int i = 0; i < numberAr.length; i++)// Заполнение массива цифрами от 2 до number
        {
            numberAr[i] = i + 2;
        }

        for (int i = 0; i < numberAr.length; i++) // Нахождение простых чисел решетом Эратосфена
        {
            if (numberAr[i] != 0) {
                sum++;
                for (int index = i + 1; index < numberAr.length; index++) {
                    if (numberAr[index] != 0 && (numberAr[index] % numberAr[i] == 0))
                        numberAr[index] = 0;
                }
            }
        }

        Integer[] outAr = new Integer[sum];

        Integer tempIndex = 0;

        for (Integer dataIt : numberAr) { // запись в выводной массив
            if (dataIt != 0) {
                outAr[tempIndex] = dataIt;
                tempIndex++;
            }

        }

        return outAr;

    }


    /**
     * Метод  сокращение делителя и знаменателя дроби
     * @param mr - числитель
     * @param nr - знаменатель
     * @return вывод числителя и знаменателя в массиве Integer[m,n]
     */
    private static Integer[] Reduction(Integer mr, Integer nr) {
        Integer[] outAr = new Integer[2];
        Integer[] pnar = PrimeNumbers(nr);

        for (int i = 0; i < pnar.length; i++) {

            if (nr >= pnar[i]) {

                if (mr % pnar[i] == 0 && nr % pnar[i] == 0) {
                    while (true) {
                        mr = mr / pnar[i];
                        nr = nr / pnar[i];
                        if (mr % pnar[i] != 0 || nr % pnar[i] != 0)
                            break;
                    }
                }
            } else
                break;
        }

        outAr[0] = mr;
        outAr[1] = nr;

        return outAr;

    }

    Integer[] inputIARN = new Integer[2]; // Введённое рациональное число

    String outputStRN; // Вывод рационального числа

    Integer a = 0; // целое число
    Integer m = 0; // числитель
    Integer n = 0; // знаменатель

    /**
     * Метод ввода рациональных чисел в формате Integer[m,n].
     * m - числитель, n- знаменатель.
     * 
     * @param data
     */
    public void setRN(Integer[] data) {
        this.inputIARN = data;
    }

    /**
     * Метод вывода рационального числа 
     * @return Вывод осуществляется в формате String: a m/n, m/n, a.
     * Где a - целое число, m - числитель, n- знаменатель
     */

    public String getRN() {
        Integer[] tenpAr = new Integer[2];
        m = inputIARN[0];
        n = inputIARN[1];
        if (n == 0)
            outputStRN = a.toString();
        else if (n == 1)
            outputStRN = m.toString();
        else if (m % n == 0) {
            a = m / n;
            outputStRN = a.toString();
        } else {
            a = (m - m % n) / n;
            m = m % n;
            tenpAr = Reduction(m, n);
            m = tenpAr[0];
            n = tenpAr[1];
            if (a != 0)
                outputStRN = a.toString() + " " + m.toString() + "/" + n.toString();
            else outputStRN =  m.toString() + "/" + n.toString();

        }

        return outputStRN;
    }

}
