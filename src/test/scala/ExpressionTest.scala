import collection.mutable.Stack
import org.scalatest.flatspec.AnyFlatSpec

class ExpressionTestSpec extends AnyFlatSpec {

  "An expression" should "evaluate to its' correct answer for each integer input" in {
    def eval(dx: Int, dy: Int) {
      val Multiply = dx * dy
      val Add = dx + dy
      val Subtract = dx - dy


      println("Product is: " + Multiply);
      println("Sum is: " + Add)
      println("Difference is: " + Subtract)


    }
  }

  it should "evaluate the given expressions (Area of a Triangle) with the given integers on input" in {
    def getArea(dx: Int, dy: Int): Unit = {
      val dc = (dx * dy)/2

      println ("Area of Triangle is : " + dc);
    }
  }

}
