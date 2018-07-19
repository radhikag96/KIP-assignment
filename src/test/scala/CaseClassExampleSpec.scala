import org.scalatest.FunSuite

class CaseClassExampleSpec extends FunSuite{
val testCase = new ReportCard()
test("for first 3 toppers")
{
  val actualValue =testCase.findFirstThreeToppers(List(Student(1, "Bob", 11, "A"),Student(2, "Martin", 11, "B"),Student(3, "Sam", 11, "A"),Student(4, "Rick", 11, "C")),List(ScoreCard(1, 88, 45, 79), ScoreCard(2, 67, 80, 45),ScoreCard(3, 99, 87, 85),ScoreCard(4, 60, 40, 50)))
  val expectedValue = List((3,"Sam"), (1,"Bob"), (2,"Martin"))
    assert(expectedValue === actualValue)
}

  test("for subject toppers")
  {
    val actualValue =testCase.findSubjectTopper("subject1" , List(Student(1, "Bob", 11, "A"),Student(2, "Martin", 11, "B"),Student(3, "Sam", 11, "A"),Student(4, "Rick", 11, "C")),List(ScoreCard(1, 88, 45, 79), ScoreCard(2, 67, 80, 45),ScoreCard(3, 99, 87, 85),ScoreCard(4, 60, 40, 50)))
    val expectedValue = (3,"Sam",99,87,85,271)
    assert(expectedValue === actualValue)
  }
  test("for display marksheet")
  {
    val actualValue =testCase.displayMarksheet(2 , List(Student(1, "Bob", 11, "A"),Student(2, "Martin", 11, "B"),Student(3, "Sam", 11, "A"),Student(4, "Rick", 11, "C")),List(ScoreCard(1, 88, 45, 79), ScoreCard(2, 67, 80, 45),ScoreCard(3, 99, 87, 85),ScoreCard(4, 60, 40, 50)))
    val expectedValue ="ID : 2  NAME : Martin  SUBJECT1 : 67.0 SUBJECT2 : 80.0 SUBJECT3 : 45.0 TOTAL MARKS : 192.0"
    assert(expectedValue === actualValue)
  }

}



