package org.modelfun

/**
 * Instantiates the specified item along a path
 */
case class Along(item: Model, path: Path = UnitPath)