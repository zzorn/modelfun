package org.modelfun.conf

/**
 * 
 */
abstract class Func1Conf(name: Symbol, func: (Double) => Double, param: Symbol = 'x, default: Double = 0) extends NamedConf(name) {
  def calculate(context: Conf) = func(context(param, default, context))
}