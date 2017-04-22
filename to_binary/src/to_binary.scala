
import scala.collection.mutable.ListBuffer
class to_binary () {
  var int_Number: Int = 0 ;
  
  def get_int_Number() : Int = {
		  return this.int_Number;
  }
  def set_int_Number(i : Int) = {
		  this.int_Number = i;
  }
  
  def get_list() : ListBuffer[String] = {
    var alist = new ListBuffer[String]();
    
    def cal (k : Int, al : ListBuffer[String]) : (Int, ListBuffer[String]) = {
      var m : Int = k;
      if (m < 2) {
        al += k.toString();
        return (k, al);
      }
      else {
        if (m % 2 == 0) {
          al += "0";
        }        else {
          al += "1";
        }
        m = k / 2;
        return cal(m,al);
      }
    }
     cal(this.int_Number, alist);
     return alist;
    
  }
  
}