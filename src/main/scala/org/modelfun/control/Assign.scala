package org.modelfun.control

import org.modelfun.{ModelRenderer, Parameters, Model}

/**
 * Assigns some parameters and renders the wrapped model.
 */
case class Assign(model: Model, assignedParameters: Parameters) extends Model {
  def render(renderer: ModelRenderer, parameters: Parameters) = model.render(renderer, parameters + assignedParameters)
}