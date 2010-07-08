package org.modelfun.conf

/**
 * Base class for configurations with single named member.
 */
abstract class NamedConf(name: Symbol) extends Conf {

  final def has(name: Symbol) = name == this.name

  final def apply(name: Symbol, default: Double, context: Conf) = if (name == this.name) calculate(context) else default

  def calculate(context: Conf): Double

}