object ShoppingCart extends App{
  var noOfItems = 0
  var orange = 0
  var apple = 0

  def totalPrice(apples:Int, oranges:Int){
    var cost = apples*0.6 + oranges*0.25
    println(cost)
  }

  def orangeScan(): Unit ={
    orange += 1
    noOfItems += 1
    scanning()
  }

  def appleScan(): Unit ={
    apple += 1
    noOfItems += 1
    scanning()
  }

  def scanning(): Unit ={
    println("Which item is being scanned? Enter 1 for apple, 2 for orange, or any other number if scanning is finished.")
    var selection = scala.io.StdIn.readInt
    selection match{
      case 1 => appleScan()
      case 2 => orangeScan()
      case _ => totalPrice(apple, orange)
    }
  }
  scanning()
}
