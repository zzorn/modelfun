package org.modelfun.paths

import org.sgine.math.Vector3

/**
 * 
 */
trait PathNode {

  def pos: Vector3

  def neighbors: List[PathNode]

  def isDot: Boolean = neighbors.isEmpty
  def isEnd: Boolean = neighbors.size == 1
  def isLink: Boolean = neighbors.size == 2
  def isFork: Boolean = neighbors.size > 2

}