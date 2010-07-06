package org.modelfun

import arrangers.Circular
import org.sgine.render.StandardDisplay
import org.sgine.core.Color
import AngleUtils._

/**
 * The example creates a sunflower model.
 */
object FlowerExample extends StandardDisplay {
  def setup() {

    // How to specify scaling that is passed as a params to forks?

    val petal  = Extrusion(segment=VSegment(angle = 0.45 turns), scale=TearDrop(), length = 5.0, color = Color.Wheat)
    val core   = DiskModel(profile=Sin, color=Color.Sienna, height=2, radius=5)
    val flower = Circular(spoke=petal, center=core, spokes=17, radius = 3, upAngle = 0.1 turns)
    val leaf   = Extrusion(VSegment(angle = 0.4 turns), scale=TearDrop(scale=4), length = 8.0, color = Color.DarkGreen)
    val stemPath = NoiseFun3(period=10, amplitude=4, length=20)
    val leaves = Along(leaf, path=stemPath, minDistance=5, density=Gauss, align=AlignAround(angle=0.25 turns, stepAround = 0.3turns))
    val stem   = Extrusion(segment= TubeSegment(radius = 0.5), path=stemPath, color = Color.OliveDrab)
    val flowerTops = AtEnds(flower, stemPath)
    val plant = Composite(stem, leaves, flowerTops)

    scene += plant

  }
}