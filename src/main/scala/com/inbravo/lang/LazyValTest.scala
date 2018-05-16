package com.inbravo.lang

/**
 * How variable, value and lazy value works
 *
 * amit.dixit
 */
object LazyValTest {

  def main(args: Array[String]) {

    println("-------------------------------------------")
    println("Variable/Value initialization phase starts...")

    /* A simple variable; which can change, It will print 'variable' during initialization phase */
    var variable: Int = { println("variable"); 1 }

    /* A simple value. It will print 'value' during initialization phase */
    val value: Int = { println("value"); 100 }

    /* A lazy value. It will print 'lazyValue' during utilization phase */
    lazy val lazyValue : java.math.BigDecimal = { println("lazyValue"); new java.math.BigDecimal(100.12) }

    println("Variable/Value initialization phase ends...")
    println("-------------------------------------------")
    println("Variable/Value utilization phase starts...")

    /* Assign new value to variable and print */
    variable = 10
    println(variable)

    /* A normal constant value. It will first initialize by printing 'value' and then print '10' */
    println(value)

    /* A lazy value. It will not initialize untill being utilized. When utilized, will print 'lazyValue' and then print '100' */
    println(lazyValue)

    println("Variable/Value utilization phase ends...")
    println("-------------------------------------------")
  }
}