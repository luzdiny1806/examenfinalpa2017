/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

import java.util.List;

/**
 *
 * @author Luz Rodríguez
 */
public class ImplArrayManipulator implements ArrayManipulator{
    
    private int i;
    private int set;
    
    public ImplArrayManipulator (int set, int i){
        this.set = set;
        this.i = i;
    }
    
    /**
     * 
     * @param set Es el parametro
     * @return El return nos devuelve cuántos elementos hay.
     */
    public int leerSet (int set){
        return this.set/2;
    }
    
    /**
     * 
     * @return 
     */
    public int setPosibilidades(){
        return(this.i)+2;
    }

    /**
     * 
     * Esto permite que la clase sea abstracta
     * @param set
     * @return Una excepción
     */
    @Override
    public int subsets(List set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
