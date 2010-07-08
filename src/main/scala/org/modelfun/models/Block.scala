package org.modelfun.models

import org.modelfun.{Parameters, ModelRenderer, Model}

/**
 * 
 */
// TODO: Add transform node that applies a transformed renderer to submodule(s)?
case class Block() extends Model {

  def render(renderer: ModelRenderer, parameters: Parameters) {

    val x = parameters('x)
    val y = parameters('y)
    val z = parameters('z)
    val w = parameters('width, 1)
    val h = parameters('height, 1)
    val d = parameters('depth, 1)

    val center = Vecor3(x, y, z)
    val radX = Vecor3(0.5 * w, 0, 0)
    val radY = Vecor3(0, 0.5 * h, 0)
    val radZ = Vecor3(0, 0, 0.5 * d)

    // TODO: Create cube
    renderer.addQuad(  )
  }

}