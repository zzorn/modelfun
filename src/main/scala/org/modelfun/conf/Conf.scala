package org.modelfun.conf

/**
 * mix between parameters and functions.
 */
trait Conf {

  def has(name: Symbol): Boolean

  def apply(name: Symbol, default: Double = 0.0, context: Conf): Double

  def + (that: Conf): Conf = ChainedConf(that, this)
}

