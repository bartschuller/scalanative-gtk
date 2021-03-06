// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package gobject

import glib.{GAllocated, GRefCounter}

import scalanative.native._
import cobj._

@CObj
class GObject extends GAllocated with GRefCounter with GSignalReceiver with CObjWrapper {
  @inline def ref(): Unit = extern
  @inline def unref(): Unit = extern
  @inline def free(): Unit = unref()
}

object GObject {

}
