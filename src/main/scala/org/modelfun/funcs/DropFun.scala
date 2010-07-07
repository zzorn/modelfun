package org.modelfun.funcs

import scala.math._
import org.modelfun.AngleUtils._

/**
 * A function for a drop shape.
 * Roughly something like this:
 * <pre>
 *   _
 *  | \_
 * </pre>
 * Created by interpolating between sin functions.
 */
case class DropFun(scale: Double) extends Fun1 {

  def value1(t: Double) = { val t2 = t*t; scale*((20/3)*t2*t+(20/3)*t2) }
  
}