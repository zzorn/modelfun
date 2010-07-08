package org.modelfun.control

import collection.SortedMap
import org.modelfun.{Parameters, ModelRenderer, Model}

/**
 * A switch structure that selects zero or one of the submodels based on a parameter value.
 * The subModels is a map from the upper limit (inclusive) that should cause the associated model to be used.
 */
case class Select(subModels: SortedMap[Double, Model], parameterName: Symbol = 'x) extends Model {
  def render(renderer: ModelRenderer, parameters: Parameters) {
    val value: Double = parameters(parameterName)
    subModels.find(e => value <= e._1) match {
      case Some(e) => e._2.render(renderer, parameters)
      case None => // Nothing to render
    }
  }
}
