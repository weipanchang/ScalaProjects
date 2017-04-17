

class Even_Fibon (end_Number : Int)
extends Fibon (end_Number){
  def get_Even : Int = {
    if (end_Number % 2 == 0) {
      return end_Number;
    }
    else {
      println("Not an even number!");
      return 0;
    }
  }
}