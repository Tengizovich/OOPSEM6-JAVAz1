public class InputRN {

    String inputStRN; // Введённое рациональное число в виде: a m/n
    // a - целое число, m - числитель, n- знаменатель

    Integer[] outputRN = new Integer[2]; // вовд рационального числа в виде [m,n]

    /**
     * Метод ввода рациональных чисел в формате a m/n, m/n, a.
     * a - целое число, m - числитель, n- знаменатель
     * @param data
     */
    public void setRN(String data) {
        this.inputStRN = data;
    }

    /**
     * Преобразование рациональных чисел из String (формат ввода a, a m/n, m/n) 
     * в Integer [m,n]. Где a - целое число, m - числитель, n- знаменатель.
     */
    public Integer[] getRN() {

        if (inputStRN.contains("/")) {
            String newDat = inputStRN.replace(" ", "/");
            inputStRN = newDat;
            String[] temArray = inputStRN.split("/");
            if (temArray.length == 2) {
                outputRN[0] = Integer.parseInt(temArray[0]);
                outputRN[1] = Integer.parseInt(temArray[1]);
            } else if (temArray.length == 3) {
                outputRN[0] = Integer.parseInt(temArray[0]) * Integer.parseInt(temArray[2])
                        + Integer.parseInt(temArray[1]);
                outputRN[1] = Integer.parseInt(temArray[2]);
            } else {
                outputRN[0] = 0;
                outputRN[1] = 0;
            }
        } else{
            outputRN[0] = Integer.parseInt(inputStRN);
            outputRN[1] = 1;
        }

        return outputRN;

    }

    public void inputStRN(String next) {
    }

}
