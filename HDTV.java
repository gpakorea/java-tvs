// HDTV.java

public class HDTV extends TV implements Digital {
  
  public HDTV() {
    super();
  }

  // method from Abstract TV class
  public String tvTYPE() {
    return "I'm a High Def 24 million color TV.";
  }
  
  // method from Digital Interface
  public String connectHDMI() {
    return "HDMI cable connected.";
  }
  
} // END class HDTV