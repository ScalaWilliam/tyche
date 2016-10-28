package io.neysofu.tyche
package stats

import org.scalatest.{WordSpec, Matchers}

class BinomialSpec extends WordSpec with Matchers {

  val n = 20
  val p = 0.5
  val gen = Commons.newBinomial(n, p)

  "A binomial distribution" when {
    
    "sampled" should {
      "always generate an integer number" in {
        val d = gen.get
        d shouldBe Math.round(d)
      }
    }
  }
}
