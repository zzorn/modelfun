package org.modelfun

import paths.{UnitPath, Path}

/**
 * Instantiates the specified item along a path
 */
case class AlongPath(item: Model, path: Path = UnitPath)