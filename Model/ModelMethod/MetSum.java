import Homework.JAVA_OOP.Model.ModelInterface.InterSum;

public class MetSum implements InterSum {

    Integer mX;
    Integer nX;

    Integer mY;
    Integer nY;

    Integer mRes;
    Integer nRes;

    Integer[] result = new Integer[2];

    /**
     * Ввод первого первого рационального числа
     */
    @Override
    public void setX(Integer[] value1) {
        mX = value1[0];
        nX = value1[1];

    }

    /**
     * Ввод второго рационального числа
     */

    @Override
    public void setY(Integer[] value2) {
        mY = value2[0];
        nY = value2[1];
    }
    
    /**
     * Сложение рациональных чисел m1/n1 + m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    @Override
    public Integer[] getSum() {
 
       System.out.println(mX);
       System.out.println(mY);
        if (nX == nY) {
            mRes = mX + mY;
            nRes = nX;
        } else {
            mRes = mX * nY + mY * nX;
            nRes = nY * nX;
        }

        result[0] = mRes;
        result[1] = nRes;
        return result;
    }

}
