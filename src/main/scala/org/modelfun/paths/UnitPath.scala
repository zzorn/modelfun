package org.modelfun.paths

import org.sgine.math.Vector3

import PathUtils._

/**
 * A path between 0,0,0 to 1,0,0
 */
object UnitPath extends PathImpl(Vector3.Zero --- Vector3.UnitX)
