public class AccountExceptions {

  public static class NegativeBalanceException extends Exception{
    public NegativeBalanceException(){
      super("Balance value not valid, below zero not allowed.");
    }
  }

  public static class NegativeRentException extends Exception{
    public NegativeRentException(){
      super("Rent value not valid, below zero not allowed.");
    }
  }

}