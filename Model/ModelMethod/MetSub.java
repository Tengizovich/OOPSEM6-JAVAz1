import Homework.JAVA_OOP.Model.ModelInterface.InterSub;

public class MetSub extends MetSum implements InterSub{

   
   

    /**
     * Ввод второго рационального числа
     */

    @Override
    public void setY(Integer[] value2) {
        mY = value2[0];
        
        nY = value2[1];
       
    }
    /**
     * Разность рациональных чисел m1/n1 - m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    
    public Integer[] getSub() {
  
       
        if (nX == nY) {
            mRes = mX - mY;
            nRes = nX;
        } else {
            mRes = mX * nY - mY * nX;
            nRes = nY * nX;
        }
        result[0] = mRes;
        result[1] = nRes;
        return result;
    }
    
}
