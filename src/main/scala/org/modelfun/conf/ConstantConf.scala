package org.modelfun.conf

case class ConstantConf(name: Symbol, value: Double) extends NamedConf(name) {

  def calculate(context: Conf) = value

}

