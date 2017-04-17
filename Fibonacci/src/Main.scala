


object Main  {
  def main(args: Array[String]) {
  run();
  }

  def run() = {
    var f : Fibon = new Fibon();
    f.setend_Number(6);
    println(f.get_Fibon());
  }

}

