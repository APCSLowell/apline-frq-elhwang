public class APLine
{
  private Aval;
  private Bval;
  private Cval;
 public APLine(int a, int b, int c){
    Aval = a;
    Bval = b;
    Cval = c;
  }
  public double getSlope(){
    return (double)a/b
  }
  public boolean OnLine(int x, int y){
    if(((a*x) + (b*y) + c) == 0)
      return true;
    return false;
  }
}
