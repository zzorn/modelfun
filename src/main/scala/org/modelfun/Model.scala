package org.modelfun

import funcs.Func

/**
 * 
 */

trait Model {

  def render(renderer: ModelRenderer, parameters: Parameters)  // Parameters include e.g. position, level of detail, and any model specific shape parameters or functions

  /**
   * Function used to calculate the parameters for rendering this model, based on the parameters passed in.
   */
  // NOTE: Can use constant values to set specific parameters, or calculate the values for local parameters from passed in parameters.
  def func: Func

  // TODO: Can function values be functions?  Or are parametes calculated for each vertex or segment or such?

}
  