/*
 * Project: AnalogDigitalDriver.java
 * Description: Creates BWTVs and HDTVs
 * Name: Aaron Snowberger
 * Date: Nov 6, 2015
 *
 * @link: http://thecubscientist.com/APCS/HFJExercises/Chapter_08.pdf
 * @link: http://sun0.cs.uca.edu/~pyoung/teaching/archive/CSCI3381_Sp12/classNotes/class14/Lesson%2014-%20Abstract%20Classes%20and%20Interfaces.pdf
 * @link: https://www.daniweb.com/programming/software-development/threads/350125/acess-abstract-class-method
 */

import java.util.ArrayList;

public class AnalogDigitalDriver {
  
  public static void main( String[] args ) {
    
    BWTV bw = new BWTV();
    HDTV hd = new HDTV();
    
    ArrayList<TV> tvs = new ArrayList<TV>();
    tvs.add( bw );
    tvs.add( hd );
    
    for ( TV tv:tvs ) { // for int i=0; i<tvs.length; i++
      System.out.println( tv.tvTYPE() );
      System.out.println( "TV on: " + tv.getTvOn() );
      tv.setTvOn( true );
      System.out.println( "TV on: " + tv.getTvOn() );
    }
    System.out.println();
    
    System.out.println( bw.rotateRabbitEars() );
    System.out.println( hd.connectHDMI() ); 
    
  } // END main method
  
} // END class AnalogDigitalDriver
