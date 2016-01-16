import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class RoutesSpec extends Specification {

  "Category Routes" should {

    "GET for /categories" in new WithApplication {
      val home = route(FakeRequest(GET, "/categories")).get
      status(home) must equalTo(OK)
    }

    "POST for /categories" in new WithApplication {
      val home = route(FakeRequest(POST, "/categories")).get
      status(home) must equalTo(OK)
    }

    "GET for /categories/1" in new WithApplication{
      val home = route(FakeRequest(GET, "/categories/1")).get
      status(home) must equalTo(OK)
    }

    "PUT for /categories/1" in new WithApplication{
      val home = route(FakeRequest(PUT, "/categories/1")).get
      status(home) must equalTo(OK)
    }

    "DELETE for /categories/1" in new WithApplication{
      val home = route(FakeRequest(DELETE, "/categories/1")).get
      status(home) must equalTo(OK)
    }

  }
}
