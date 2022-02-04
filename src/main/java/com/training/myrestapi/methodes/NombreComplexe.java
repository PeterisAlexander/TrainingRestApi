package com.training.myrestapi.methodes;

public class NombreComplexe {
	
	public double real;
    public double imag;
    
    /**
     * 
     * @param r
     * @param i
     */
    public NombreComplexe(double r, double i) {
        this.real = r;
        this.imag = i;
    }
    
    /**
     * 
     * @param c1
     * @param c2
     * @return complex number
     */
    public static NombreComplexe somme(NombreComplexe c1, NombreComplexe c2)
    {
    	NombreComplexe c3 = new NombreComplexe(0.0, 0.0);
    	
        c3.real = c1.real + c2.real;
        c3.imag = c1.imag + c2.imag;
        
        return c3;
    }
}
