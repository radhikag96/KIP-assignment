import org.scalatest.FunSuite

class PatternMatching2Spec extends FunSuite {
  val testCase = new PatternMatching2
  test("for string"){
    val actualValue = testCase.returnWhatYouGet("hi")
    val expectedVlue = "you gave me this string hi"
    assert(actualValue === expectedVlue)
  }
  test("for int"){
    val actualValue = testCase.returnWhatYouGet(6)
    val expectedVlue = "you gave me this int 6"
    assert(actualValue === expectedVlue)
  }
  test("for float"){
    val actualValue = testCase.returnWhatYouGet(6.5f)
    val expectedVlue = "you gave me this float 6.5"
    assert(actualValue === expectedVlue)
  }
  test("for array"){
    val actualValue = testCase.returnWhatYouGet(Array(1,2,3,4))
    val expectedVlue = "you gave me this array 1,2,3,4"
    assert(actualValue === expectedVlue)
  }
  test("for array of strings"){
    val actualValue = testCase.returnWhatYouGet(Array("a", "b"))
    val expectedVlue = "you gave me this string a,b"
    assert(actualValue === expectedVlue)
  }
  test("for list"){
    val actualValue = testCase.returnWhatYouGet(List(4, 7, 8, 9))
    val expectedVlue = "you gave me this list List(4, 7, 8, 9)"
    assert(actualValue === expectedVlue)
  }
  test("for map"){
    val actualValue = testCase.returnWhatYouGet(Map(1 -> 'a', 2 -> 'b'))
    val expectedVlue = "you gave me this map Map(1 -> a, 2 -> b)"
    assert(actualValue === expectedVlue)
  }
  test("for case class"){
    val actualValue = testCase.returnWhatYouGet(Pet("Kalie"))
    val expectedVlue = "Kalie is a field in case class pet"
    assert(actualValue === expectedVlue)
  }
}
