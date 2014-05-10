package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(contains(singletonSet(1), 2))
  val even = map((x: Int) => x > 3, x => x * 2)
  println(printSet(even))
}
