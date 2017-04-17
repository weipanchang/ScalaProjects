

object Main {

  def main(args: Array[String]) {
    var m : Main = new Main();
    m.run();
    
  }
}
class Main() {
  
  def run() = {
  
    var f : Fibon = new Fibon(2);
    f.setend_Number(21);
    println(f.get_Fibon());
    var e_f : Even_Fibon =  new (Even_Fibon) (f.get_Fibon());
    e_f.setend_Number(f.get_Fibon());
    println(e_f.get_Even);
  }
}

