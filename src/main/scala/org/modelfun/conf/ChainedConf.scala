package org.modelfun.conf

/**
 * 
 */
case class ChainedConf(first: Conf, second: Conf) extends Conf {

  override def has(name: Symbol): Boolean = first.has(name) || second.has(name)
  
  override def apply(name: Any, default: Double, context: Conf) = if (first has name) first(name, default, context) else second(name, default, context)
  
}

