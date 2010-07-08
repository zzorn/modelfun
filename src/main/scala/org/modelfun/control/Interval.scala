package org.modelfun.control

import scala.math

/**
 * Utility definitions that allow intervals to be specified as  a -- b  or  a --
 */
object Interval {

  implicit def intToIntervalStart(i: Int): IntervalStart = IntervalStart(d)
  implicit def doubleToIntervalStart(d: Double): IntervalStart = IntervalStart(d)

  case class IntervalStart(start: Double) {
    def -- (end: Double): Interval = Interval(start, end)
    def -- : Interval = Interval(start=start)
  }

}

case class Interval(start: Double = Math.NEG_INF_DOUBLE, end: Double = Math.POS_INF_DOUBLE) {

  def contains(v: Double): Boolean = v >= start && v < end

}