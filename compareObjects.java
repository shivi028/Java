public class compareObjects {
  public static void main(String[] args) {
    Double x =  Double.valueOf(123.45555);
    // creating constructor of the Long class
    Long y =  Long.valueOf(9887544);
    // invoking the equals() method
    System.out.println("Objects are not equal, hence it returns " + x.equals(y));
    System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));
  }
}
