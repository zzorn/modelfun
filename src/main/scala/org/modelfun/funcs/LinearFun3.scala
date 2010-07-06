package org.modelfun.funcs

import org.sgine.math.Vector3

case class LinearFun3(start: Vector3 = Vector3.Zero, delta: Vector3 = Vector3.UnitX) extends Fun3 {

  def apply(t:Double):Vector3 = start + delta * t

}