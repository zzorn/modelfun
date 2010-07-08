package org.modelfun.control

import org.modelfun.{Parameters, ModelRenderer, Model}

/**
 * Compares a parmeter against a value, and selects first alternative if it is less than the value, and the second alternative if it is equal to or greater than the value.
 */
case class If(parameter: Symbol, lessThan: Double, thenModel: Model, elseModel: Model) extends Model {
  def render(renderer: ModelRenderer, parameters: Parameters) {
    if (parameters(parameter) < lessThan) thenModel.render(renderer, parameters)
    else elseModel.render(renderer, parameters)
  }
}