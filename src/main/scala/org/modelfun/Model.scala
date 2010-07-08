package org.modelfun

import funcs.Func

/**
 * 
 */

trait Model {

  def render(renderer: ModelRenderer, parameters: Parameters)  // Parameters include e.g. position, level of detail, and any model specific shape parameters or functions

}
  