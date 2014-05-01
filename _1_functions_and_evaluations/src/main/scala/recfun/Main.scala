package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println(balance("(just a(n))( example)".toList))
    println(countChange(10, List(2, 3)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def process(text: List[Char], bal: Int) : Int = {
      if (bal < 0)
        bal
      else if (text.isEmpty)
          bal
        else
          if (text.head == '(')
            process(text.tail, bal + 1)
          else
            if (text.head == ')')
              process(text.tail, bal - 1)
            else
              process(text.tail, bal)
    }
    process(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins.isEmpty || money == 0)
      0
    else if (money == coins.head)
      1 + countChange(money, coins.tail)
      else
        if (money < coins.head)
          0 + countChange(money, coins.tail)
        else
          if (money > coins.head)
            countChange(money - coins.head, coins) + countChange(money, coins.tail)
          else
            0
  }
}
