import org.scalatest.FunSuite

class PatternMatchingSpec extends FunSuite{
val testPattern = new PatternMatching()
  test("for max element of list"){
    val actualValue = testPattern.max(List(2,6,3,9,5))
    val expectedValue = 9
    assert(actualValue === expectedValue)


  }
  test("for min element of list"){
    val actualValue = testPattern.min(List(2,6,3,9,5))
    val expectedValue = 2
    assert(actualValue === expectedValue)


  }
  test("for length of list"){
    val actualValue = testPattern.length(List(2,6,3,9,5))
    val expectedValue = 5
    assert(actualValue === expectedValue)


  }
  test("for nth element from end  of list"){
    val actualValue = testPattern.lastNth(2,List(2,6,3,9,5))
    val expectedValue = 9
    assert(actualValue === expectedValue)


  }
}
