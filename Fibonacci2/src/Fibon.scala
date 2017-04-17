

class Fibon (var end_Number : Int) {
  /*
	 * var end_Number: Int;
   * def this(end_Number : Int) = {
	 *  this();
	 * this.end_Number = end_Number;
   * }
   
   */
  
  def getend_Number() : Int = {
		  return this.end_Number;
  }
  def setend_Number(i : Int) = {
		  this.end_Number = i;;
  }
  def recursive(n : Int) : Int = {
    if (n <3)  {return 1;}
    return recursive (n-1) + recursive (n-2);
  }
  
  def get_Fibon() : Int = {
    return recursive(this.end_Number)
  }
  
}