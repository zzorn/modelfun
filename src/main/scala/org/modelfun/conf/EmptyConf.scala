package org.modelfun.conf

object EmptyConf extends Conf {
  def apply(name: Any, default: Double, context: Conf) = default
  def has(name: Any) = false
}

