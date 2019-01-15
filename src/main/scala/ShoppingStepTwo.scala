object ShoppingStepTwo extends App{
  var apple = 0
  var orange = 0

  def checkOut(apples:Int, oranges:Int){
    val cost = apples*0.6 + oranges*0.25
    println(f"Total cost is £$cost%2.2f")
  }

  val scannedItems = scala.collection.mutable.ListBuffer[Int]()

  def scanning(): Unit ={
    println("Enter 1 if item is an apple, and 2 for an orange, or any other key to get bill.")
    var choice = scala.io.StdIn.readInt
    if(choice != 1 && choice != 2) {
      for(i <- 0 until scannedItems.length){
        if(scannedItems(i) == 1){
          apple += 1
        }
        else{
          orange += 1
        }
      }
      appleDiscounts()
      orangeDiscounts()
    }
    else {
      scannedItems += choice
      scanning()
    }
  }

  def appleDiscounts(): Unit ={
    if(apple % 2 == 0){
      apple = apple/2
    }
    else{
      apple = 1 + (apple - 1)/2
    }
  }

  def orangeDiscounts(): Unit ={
    if(orange % 3 == 0){
      orange = (orange/3)*2
    }
    else if(orange % 3 == 1){
      orange = 1 + ((orange - 1)/3)*2
    }
    else{
      orange = 2 + ((orange - 2)/3)*2
    }
  }

  scanning
  checkOut(apple, orange)
}
