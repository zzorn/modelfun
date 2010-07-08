package org.modelfun.paths

/**
 * Simple path consisting of the nodes connected to some root nodes.
 */
case class PathImpl(roots: List[PathNode]) extends Path