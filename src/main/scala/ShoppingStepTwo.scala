object ShoppingStepTwo extends App{
  var apple = 0
  var orange = 0

  def checkOut(apples:Int, oranges:Int){
    val cost = apples*0.6 + oranges*0.25
    println(f"Total cost is £$cost%2.2f")
  }

  val scannedItems = List(1, 2, 2, 1, 2, 2, 1, 2)

  for(i <- 0 until scannedItems.length){
    if(scannedItems(i) == 1){
      apple += 1
    }
    else{
      orange += 1
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
  appleDiscounts()
  orangeDiscounts()
  checkOut(apple, orange)
}
