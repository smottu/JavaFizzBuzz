public class FizzBuzz {
  
  public static void main(String[] args) {
    int i =0;
    
  int loopCount = 100;
  int numFizz = 3;
  int numBuzz =5;
  String strFizz = "Fizz";
  String strBuzz = "Buzz";
  
  
〇 ( i = 1; i <= loopCoount; i++) {
  〇( i % (numFizz * numBuzz ) == 0 ){
    System.out.println(strFizz +strBuzz);
  }〇　( i % numFizz == 0) {
    System.out.println(strFizz);
    } else if (〇) {
      System.out.println(strBuzz);
    } else {
      System.out.println(i);
    }
  }
}
  
}