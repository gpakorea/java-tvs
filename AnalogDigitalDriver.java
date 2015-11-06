/*
 * Project: AnalogDigitalDriver.java
 * Description: Creates BWTVs and HDTVs
 * Name: Aaron Snowberger
 * Date: Nov 6, 2015
 */

import java.util.ArrayList;

public class AnalogDigitalDriver {
  
  public static void main( String[] args ) {
    
    BWTV bw = new BWTV();
    HDTV hd = new HDTV();
    
    //ArrayList tvs = new ArrayList<TV>();
    //tvs.add( bw );
    //tvs.add( hd );
    
    System.out.println( bw.tvTYPE() );
    System.out.println( bw.rotateRabbitEars() );
    System.out.println();
    System.out.println( hd.tvTYPE() );
    System.out.println( hd.connectHDMI() ); 
    
  } // END main method
  
} // END class AnalogDigitalDriver