

object Main {
  
  def main(args: Array[String]) {
    var m : Main = new Main();
    m.run();
  }
}

class Main() {
  
  def run() = {
  
    var f : to_binary = new to_binary();
    f.set_int_Number(30);
//    f.get_list().reverse;
    println(f.get_list().reverse);
    println(f.get_list());
    
//    var e_f :  =  new (Even_Fibon) (f.get_Fibon());
//    e_f.setend_Number(f.get_Fibon());
//    println(e_f.get_Even);
  }
}