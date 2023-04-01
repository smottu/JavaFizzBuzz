public class Main {
  public static void main (String[] args) {
    int a = 10;
    int b = 10;
    System.out.println(++a + 50);
    //61 aの値が1増える　その後50たす
    System.out.println(b++ + 50);
    //60　bに50足したものに　bの値が１増える
  }
}