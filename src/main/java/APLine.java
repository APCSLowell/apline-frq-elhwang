public class APLine
{
  private int Aval;
  private int Bval;
  private int Cval;
 public APLine(int a, int b, int c){
    Aval = a;
    Bval = b;
    Cval = c;
  }
  public double getSlope(){
    return (double)-Aval/Bval;
  }
  public boolean isOnLine(int x, int y){
    if(((Aval*x) + (Bval*y) + Cval) == 0)
      return true;
    return false;
  }
}
