/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_entornos;
/**
 *
 * @author mcruz
 */
public class Racional
{
  private int num1;
  private int num2;

    /**
     *
     */
    public Racional() 
  {
    this.num1 = 0;
    this.num2 = 1;
  }

    /**
     *
     * @param num
     */
    public Racional( int num ) 
  {
    this.num1 = num;
    this.num2 = 1;
  }

    /**
     *
     * @param num
     * @param den
     */
    public Racional( int num, int den ) 
  {
    this.num1 = num;
    this.num2 = den;
    if ( this.num2 == 0 )
    {
      System.out.println("Error: denominador 0. Se asigna 1.");
      this.num2 = 1;
    }
    if ( this.num2 < 0 )
    {
      this.num1 = -this.num1;
      this.num2 = -this.num2;
    }
    
  }
  
    /**
     *
     * @param r
     */
    public Racional( Racional r ) 
  {
     this.num1 = r.num1;
     this.num2 = r.num2;
  }

    /**
     *
     * @param r
     * @return
     */
    public Racional Sumar( Racional r )
  {
    return new Racional(this.num1 * r.num2 +
                         this.num2 * r.num1,
                         this.num2 * r.num2 );
  }
  
    /**
     *
     * @param r
     * @return
     */
    public Racional restar( Racional r )
  {
      new Racional().num1=this.num1 * r.num2 - this.num2 * r.num1;
      new Racional().num2= this.num2 * r.num2 ;
    return new Racional();
  }
  
    /**
     *
     * @param r
     * @return
     */
    public Racional multiplicar( Racional r )
  {
    return new Racional(this.num1 * r.num1,
                         this.num2 * r.num2 );
  }
  
    /**
     *
     * @param r
     * @return
     */
    public Racional dividir( Racional r )
  {
    return new Racional(this.num1 * r.num2,
                         this.num2 * r.num1 );
  }
  
    /**
     *
     * @param r
     * @return
     */
    public boolean equals( Racional r )
  {
    return ( this.num1 * r.num2 ==
             this.num2 * r.num1 );
  }

    /**
     *
     * @param r
     * @return
     */
    public boolean menor( Racional r )
  {
    return ( this.num1 * r.num2 <
             this.num2 * r.num1 );
  }

    /**
     *
     * @param r
     * @return
     */
    public boolean mayor( Racional r )
  {
    return ( this.num1 * r.num2 >
             this.num2 * r.num1 );
  }
  
    /**
     *
     * @return
     */
    public String toString()
  {
    return this.num1 + "/" + this.num2;
  }

 
}
