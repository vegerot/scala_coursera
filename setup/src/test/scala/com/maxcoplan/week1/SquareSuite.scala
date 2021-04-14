package com.maxcoplan.week1
import com.maxcoplan.week1.SquareRoot.sqrt
import org.junit._

class SquareSuite {


  @Test def `square roots of normal numbers`: Unit = {
    {
      val num = 10.0
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
    {
      val num = 1.0
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
    {
      val num = 81
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
  }

  @Test def `square roots of large numbers`: Unit = {
    {
      val num = 1.0e20
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
    {
      val num = 1.0e50
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
  }

  @Test def `square roots of small numbers`: Unit = {
    {
      val num = 0.001
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
    {
      val num = 1.0e-20
      Assert.assertEquals(sqrt(num), Math.sqrt(num), .0001)
    }
  }

  @Rule def individualTestTimeout = new org.junit.rules.Timeout(1000)
}

