package org.modelfun.funcs

import org.modelfun.Parameters

/**
 */
trait Func {

  /**
   * Applies the function using the provided parameters and returns the new calculated version.
   */
  def apply(params: Parameters): Parameters

}