
case class Pet(name :String)
class PatternMatching2 {

  def returnWhatYouGet(valType: Any):Any={
    valType match {

      case s: String => s"you gave me this string $s"
      case i: Int => s"you gave me this int $i"
      case f: Float => s"you gave me this float $f"
      case a: Array[Int] => s"you gave me this array ${a.mkString(",")}"
      case as: Array[String] => s"you gave me this string ${as.mkString(",")}"
      case l: List[Int] => s"you gave me this list $l"
      case p:Pet => s"${p.name} is a field in case class pet"
      case m: Map[_, _] => s"you gave me this map $m"
    }


  }
}
  object MainObject1 {

    def main(args: Array[String]): Unit = {


      val returnVal = new PatternMatching2
      println(returnVal.returnWhatYouGet("hi"))
      println(returnVal.returnWhatYouGet(5))
      println(returnVal.returnWhatYouGet(3.5f))
      println(returnVal.returnWhatYouGet(Array(1, 2, 3, 4)))
      println(returnVal.returnWhatYouGet(Array("a", "b")))
      println(returnVal.returnWhatYouGet(Pet("Kalie")))
      println(returnVal.returnWhatYouGet(List(4, 7, 8, 9)))
      println(returnVal.returnWhatYouGet(Map(1 -> 'a', 2 -> 'b')))


    }
  }





