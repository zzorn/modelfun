package org.modelfun.paths

import org.sgine.math.Vector3

object PathUtils {

  implicit def vector3ToPathNode(v: Vector3): PathNodeImpl = PathNodeImpl(v)

}