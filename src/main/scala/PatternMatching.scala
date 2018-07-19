class PatternMatching{


  def max(list: List[Int]): Any = list match {
    case Nil => None
    case List(x: Int) => x
    case x :: y :: rest => max((if (x > y) x else y) :: rest)
  }



  def min(list: List[Int]): Any = list match {
    case Nil => None
    case List(x: Int) => x
    case x :: y :: rest => min((if (x < y) x else y) :: rest)
  }
  def length(l:List[Int]):Int = l match {
    case Nil => 0
    case h :: tail => 1 + length(tail)
  }
  def lastNth[A](n: Int, l:List[A]): A = l match {
    case tail if (tail.length == n) => tail.head
    case _ :: tail => lastNth(n, tail)
    case _ => throw new NoSuchElementException
  }


}

object MainObject {
  def main(args: Array[String]): Unit = {

    val pattern = new PatternMatching
    println("Max:" + pattern.max(List(4, 8, 6, 1, 5)))
    println("Min:" + pattern.min(List(4, 8, 6, 1, 5)))
    println("length:" + pattern.length(List(4, 8, 6, 1, 5)))
    println("nth element from last:" + pattern.lastNth(3,List(4, 8, 6, 1, 5)))
  }

}
