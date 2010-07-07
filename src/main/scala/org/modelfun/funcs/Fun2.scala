package org.modelfun.funcs

import org.sgine.math.Vector2

/**
 * A Fun with a two dimensional output, fills in values for z with the value for x by default.
 */
trait Fun2 extends Fun {

  def value1(t: Double) = value2(t)._1
  def value3(t: Double) = { val v = value2(t); (v._1, v._2, v._1) }

}
