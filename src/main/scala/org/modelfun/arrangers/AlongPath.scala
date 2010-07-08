package org.modelfun

import conf.Conf
import paths.{UnitPath, Path}

/**
 * Instantiates the specified item along a path
 */
case class AlongPath(item: Model, path: Conf) extends Model {

}
