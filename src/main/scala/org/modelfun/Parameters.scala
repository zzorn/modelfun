package org.modelfun

/**
 * 
 */
trait Parameters {
  
  def apply(name: Symbol, default: Double = 0.0): Double

}