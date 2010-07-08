package org.modelfun.paths

import org.sgine.math.Vector3

/**
 * A node on a path.  Can have zero or more neighbours.
 */
case class PathNodeImpl(pos: Vector3, var neighbors: List[PathNodeImpl] = Nil) extends PathNode {

  /** Links this node with the specified node both ways, and returns this node */
  def ---(that: PathNodeImpl): PathNodeImpl = {
    if (that != this) {
      this --> that
      this <-- that
    }
    this
  }

  /** Crates a link from this node to the specified node and returns this node. */
  def -->(that: PathNodeImpl): PathNodeImpl = {
    if (that != this) neighbors = that :: neighbors
    this
  }

  /** Crates a link from the specified node to this node and returns the other node. */
  def <--(that: PathNodeImpl): PathNodeImpl = {
    if (that != this) that.neighbors = this :: neighbors
    that
  }


}