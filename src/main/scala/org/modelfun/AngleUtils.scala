package org.modelfun

import scala.math.Pi

/**
 * 
 */

object AngleUtils {

  val Tau = 2 * Pi

  case class Angle(angle: Double) {
    def Tau: Double = angle * Tau
    def Pi: Double = angle * Pi
    def deg: Double = angle * Tau / 360.0
    def rad: Double = angle
    def degrees: Double = deg
    def radians: Double = rad
    def turns: Double = Tau
    def turn: Double = turns
  }

  implicit def doubleToAngle(angle: Double): Angle = Angle(angle)

}
