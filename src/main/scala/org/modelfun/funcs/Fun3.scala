package org.modelfun.funcs

import org.sgine.math.Vector3

/**
 * A Fun with a three dimensional output.
 */
trait Fun3 extends Fun {

  def value1(t: Double) = value3(t)._1
  def value2(t: Double) = { val v = value3(t); (v._1, v._2) }
}