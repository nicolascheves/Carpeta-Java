package sociedad.condiciones;
import sociedad.*;
public class CriterioAnd extends CriterioDoble{
    public CriterioAnd(Criterio c,Criterio c2){
        super(c,c2);
    }
    public boolean cumple(Bono b){
        return this.getCriterio1().cumple(b)&& this.getCriterio2().cumple(b);
    }
}
