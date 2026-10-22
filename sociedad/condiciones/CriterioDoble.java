package sociedad.condiciones;
import sociedad.*;
public abstract class CriterioDoble extends Criterio{
    private  Criterio c,c2;

    public CriterioDoble(Criterio c, Criterio c2){
        this.c=c;
        this.c2=c2;
    }    
    public abstract boolean cumple(Bono b);

    public Criterio getCriterio1(){
        return this.c;
    }
    public Criterio getCriterio2(){
        return this.c2;
    }
}
