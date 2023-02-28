import Homework.JAVA_OOP.Console.View;
import Homework.JAVA_OOP.Model.Calc.RN_Calc;
import Homework.JAVA_OOP.Model.ModelLogger.LoggerMP;

public class Presenter {
    View view; // Метод взаимодействия с интерфейсом, консолью ввода.

    RN_Calc model = new RN_Calc(); // Модель выполнения математической операции.

    Integer[] res; // Результат расчёта

    View m = new View(); // Описание меню

    LoggerMP log = new LoggerMP();

    Integer[] tempData = new Integer[4];
    Integer[] tempX = new Integer[2];
    Integer[] tempY = new Integer[2];



    public Presenter( View v) {

        this.view = v;
    }

    public Integer[] Data() {
        Integer[] tempDA= new Integer[4];
        System.out.println("Рациональные числа вводятся: a m/n, m/n, a.\n"
        +"Где a - целое число, m - числитель, n- знаменатель.");
        String xStr = view.getValueStr("Введите 1-е число: ");
        String yStr = view.getValueStr("Введите 2-е число: ");

        Integer[] xRN = view.getValueRN(xStr);        
        tempDA[0] = xRN[0];
        tempDA[1] = xRN[1];

        Integer[] yRN = view.getValueRN(yStr);
        tempDA[2] = yRN[0];
        tempDA[3] = yRN[1];


        System.out.println();
        log.setLogger("Пользователь ввёл 1-число: "+ xStr);
        log.setLogger("Пользователь ввёл 2-число: "+ yStr);
        
        return tempDA;
        
    }

    public void showData(Integer[] res) {
        String data = view.showRN(res, "Ответ = ");
        log.setLogger("Ответ "+ data);
        System.out.println();
    }

    public void buttonClickRN() {
        while (true) {
            switch (m.MenuRN()) {
                case 1:// Операция сложения
                    log.setLogger("Выбрана операция сложения");
                    tempData= Data();

                    tempX [0] = tempData[0];                  
                    tempX [1] = tempData[1];
                    tempY [0] = tempData[2];
                    tempY [1] = tempData[3];

                    res = model.getSum(tempX,tempY);
                    showData(res);
                    break;
                case 2:// Операция вычитания
                    log.setLogger("Выбрана операция вычитания");
                    tempData=Data();

                    tempX [0] = tempData[0];                  
                    tempX [1] = tempData[1];
                   
                    tempY [0] = tempData[2];
                    tempY [1] = tempData[3];
                    

                    res = model.getSub(tempX,tempY);
                    showData(res);
                    break;
                case 3:// Произведение
                    log.setLogger("Выбрана операция умножения");
                    tempData=Data();

                    tempX [0] = tempData[0];                  
                    tempX [1] = tempData[1];
                    tempY [0] = tempData[2];
                    tempY [1] = tempData[3];

                    res = model.getMult(tempX,tempY);
                    showData(res);
                    break;
                case 4:// Деление
                    log.setLogger("Выбрана операция деления");
                    tempData=Data();

                    tempX [0] = tempData[0];                  
                    tempX [1] = tempData[1];
                    tempY [0] = tempData[2];
                    tempY [1] = tempData[3];

                    res = model.getDiv(tempX,tempY);
                    showData(res);
                    break;
                case 0: // Выход из программы
                    log.setLogger("Выход из программы");
                    return;
            }

        }

    }

   

   

}
