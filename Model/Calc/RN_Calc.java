import Homework.JAVA_OOP.Model.Method.CalcModel;
import Homework.JAVA_OOP.Model.ModelInterface.InterSum;
import Homework.JAVA_OOP.Model.ModelMethod.MetDiv;
import Homework.JAVA_OOP.Model.ModelMethod.MetMult;
import Homework.JAVA_OOP.Model.ModelMethod.MetSub;
import Homework.JAVA_OOP.Model.ModelMethod.MetSum;

public class RN_Calc  {

   
    MetSum sum = new MetSum();
    MetSub sub = new MetSub();
    MetMult mult = new MetMult();
    MetDiv div = new MetDiv();

   
    /**
     * Сложение рациональных чисел m1/n1 + m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    
    public Integer[] getSum(Integer[] x,Integer[] y) {
 
       sum.setX(x);
       sum.setY(y);

        return sum.getSum();
    }

    /**
     * Разность рациональных чисел m1/n1 - m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    
    public Integer[] getSub(Integer[] x,Integer[] y) {
  
        sub.setX(x);
        sub.setY(y);;
       
        return sub.getSub();
    }

    /**
     * Произведение рациональных чисел m1/n1 * m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    
    public Integer[] getMult(Integer[] x,Integer[] y) {
        
        mult.setX(x);
        mult.setY(y);;
        
        return mult.getMult();
    }

    /**
     * Деление рациональных чисел m1/n1 / m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    
    public Integer[] getDiv(Integer[] x,Integer[] y) {
        div.setX(x);
        div.setY(y);
        
        return div.getDiv();
    }

    

}
