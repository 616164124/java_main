package JUC.com.Interview;

/** 父转子产生运行时错误 */
public class animal {
  public void noise() {
    System.out.println("animal");
  }

  public static void main(String[] args) {
      // 父转子产生运行时错误
      // cat a = (cat) new animal();
      // a.noise();
      System.out.println();
      dog dog = new dog();
      // object()
      Object o = new Object();
      cat c = (cat) o;
  }
}

class cat extends animal {
    @Override
    public void noise() {
        System.out.println("cat");
    }
}

class dog extends animal1 {}

class animal1 {
  private void animl1Void() {
    System.out.println("animl1Void");
  }
}
