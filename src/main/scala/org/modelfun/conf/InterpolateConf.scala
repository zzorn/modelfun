package org.modelfun.conf

/**
 * 
 */
case class InterpolateConf(start: Conf, end: Conf, pos: Symbol = 't, startValue: Double = 0, endValue: Double = 1) extends Conf {

  def has(name: Symbol) = start.has(name) || end.has(name)

  override def apply(name: Symbol, default: Double, context: Conf) {
    val t = context(pos)
    val r = if (endValue == startValue) 0.5 else (t - startValue) / (endValue - startValue)

    if (start.has(name) && end.has(name)) start(name) * (1.0 - r) + end(name) * r
    else if (start.has(name)) start(name)
    else if (end.has(name)) end(name)
    else default


  }
}