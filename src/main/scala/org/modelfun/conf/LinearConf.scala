package org.modelfun.conf

/**
 * 
 */
case class LinearConf(name: Symbol, valueAtZero: Double, increment: Double, param: Symbol = 't) 
        extends Func1Conf(name, x => valueAtZero + increment * x, param)
