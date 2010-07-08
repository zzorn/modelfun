package org.modelfun.paths

/**
 * Arbitrary network of connected nodes.
 */
trait Path {
  def roots: List[PathNode]
}
