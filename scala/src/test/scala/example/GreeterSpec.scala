package example

import org.scalatest._

class GreeterSpec extends FlatSpec with Matchers {
  "The Greeter object" should "say hello" in {
    Greeter.greeting shouldEqual "hello"
  }
}
