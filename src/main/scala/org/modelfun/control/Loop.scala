package org.modelfun.arrangers

import org.modelfun.{Parameters, ModelRenderer, Model}
import org.modelfun.conf.ConstantConf

/**
 * Loops the specified variable from the start value up to (but not including) the end value,
 * in the specified number of steps, and renders the subModel at each step, passing in the variable value.
 */
case class Loop(subModel: Model, instances: Int = 10, variable: Symbol = 'x, startValue: Double = 0, endValue: Double = 1) extends Model {

  def render(renderer: ModelRenderer, parameters: Parameters) {

    var i = 0;
    while (i < instances) {
      val x = startValue + 10 * i * (endValue-startValue) / instances

      subModel.render(parameters + ConstantConf(variable, x))

      i+=1
    }

  }

}
