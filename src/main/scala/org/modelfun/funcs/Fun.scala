package org.modelfun.funcs

import org.sgine.math.{Vector3, Vector2}

/**
 * Function that can produce a one, two, or three coordinate result for a given input.
 */
trait Fun {

  def value1(t: Double): Double
  def value2(t: Double): (Double,Double)
  def value3(t: Double): (Double,Double,Double)

  def vec2(t: Double): Vector2 = Vector2(value2(t))
  def vec3(t: Double): Vector3 = Vector3(value3(t))

}
