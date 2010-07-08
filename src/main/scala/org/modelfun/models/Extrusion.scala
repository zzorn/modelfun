package org.modelfun

import paths.{UnitPath, Path}

/**
 * 
 */
case class Extrusion(path: Parameters=>Path = UnitPath, outline: Parameters=>Path) extends Model

