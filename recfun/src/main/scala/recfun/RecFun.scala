package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    // assert(c <= r)
    // assert(c >= 0)
    // assert(r >= 0)
    if (r == 0 || c == 0 || r == c) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    // gross
    def helper(chars: List[Char], opens: Int): Boolean = {
      if (chars.isEmpty) opens == 0
      else {
        val next = if (chars.head == '(') opens + 1
         else if (chars.head == ')') opens - 1
         else opens
        if (opens < 0) false
        else helper(chars.tail, next)
      }
    }

    helper(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    /**
     * same thing, but sorted
     */
    def helper(money: Int, coins: List[Int]) = {
      if (coins.isEmpty)
        if (money == 0) 1
        else 0
      else if (money - coins.head == 0) 1
      else if (money - coins.head < 0) 0
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
    helper(money, coins.sorted)

  }
}
