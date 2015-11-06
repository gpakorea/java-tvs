// BWTV.java

public class BWTV extends TV implements Analog {
  
  public BWTV() {
    super();
  }
  
  // method from Abstract TV class
  public String tvTYPE() {
    return "I'm a black and white TV.";
  }
  
  // method from Analog Interface
  public String rotateRabbitEars() {
    return "Rabbit ears rotated 45 degrees.";
  }
  
} // END class BWTV