public class GoogleBillboard {
  public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
  public static void main(final String[] args){            
    for(int i=1;i<e.length()-10;i++){
      String digits=0;
      digits=e.substring(i,i+10);
      if(isPrime(digits)==true){
        System.out.println(Double.parseDouble(digits));
        break;
      }
    }
  }
  public static boolean isPrime(double dNum){   
    //your code here
    if(dNum<=1)
      return false;
    for(int i=2;i<=Math.sqrt(dNum);i++){
      if(dNum%i==0)
        return false;
    }
    return true;
  }
}
