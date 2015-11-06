// Abstract TV.java

public abstract class TV {
  
  private boolean tvON;
  
  public TV() {
    tvON = false;
  }
  
  public void setTvOn( boolean power ) {
    tvON = power;
  }
  
  public boolean getTvOn() {
    return tvON;
  }
  
  public abstract String tvTYPE();
  
} // END abstract class TV