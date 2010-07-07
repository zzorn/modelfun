package org.modelfun.funcs

/**
 * A Fun with a one dimensional output, fills in values for y and z with 0 by default.
 */
trait Fun1 extends Fun {

  def value2(t: Double): (Double,Double) = { val v = value1(t); (v, 0) }
  def value3(t: Double): (Double,Double,Double) = { val v = value1(t); (v, 0, 0) }

}