object Shopping extends App{
  var apple = 0
  var orange = 0

  val scannedItems = List(1, 1, 2, 1, 2, 1)
  for(i <- 0 until scannedItems.length){
    if(scannedItems(i) == 1){
      apple += 1
    }
    else if(scannedItems(i) == 2){
      orange += 1
    }
  }

  def checkOut(apples:Int, oranges:Int){
    var cost = apples*0.6 + oranges*0.25
    println(f"Total cost is £$cost%2.2f")
  }

  checkOut(apple, orange)
}