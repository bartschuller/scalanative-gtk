// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package gtk

import glib.{gboolean, gdouble}

import scalanative.native._

/**
 * Widget that displays a [[GtkTextBuffer]]
 *
 * @see [[https://developer.gnome.org/gtk3/stable/GtkTextView.html]]
 */
class GtkTextView extends GtkContainer {

  /**
   * Sets the given buffer as the buffer being displayed by this text view.
   * The previous buffer displayed is unreferenced, and a reference is added to `buffer`.
   * If you owned a reference to `buffer` before passing it to this function, you must remove that reference yourself;
   * GtkTextView will not "adopt" it.
   *
   * @param buffer new buffer
   */
  @inline final def setBuffer(buffer: GtkTextBuffer): Unit = extern

  /**
   * Returns the currently displayed text buffer.
   * The reference count on the buffer is not incremented; the caller of this function
   * won't own a new reference.
   */
  @inline final def getBuffer(): GtkTextBuffer = extern

  /**
   * Scrolls this text view so that `mark` is on the screen in the position indicated by `xalign` and `yalign`.
   * An alignment of 0.0 indicates left or top, 1.0 indicates right or bottom, 0.5 means center.
   * The effective screen size for purposes of this function is reduced by a margin of size `withinMargin`.
   *
   * @param mark a GtkTextMark
   * @param withinMargin margin as a [0.0,0.5) fraction of screen size
   * @param useAlign if false, the text scrolls the minimal distance to get the mark onscreen,
   *                 possibly not scrolling at all.
   * @param xalign horizontal alignment of mark within the visible area
   * @param yalign vertical alignment of mark within visible area
   */
  @inline final def scrollToMark(mark: GtkTextMark, withinMargin: gdouble, useAlign: gboolean, xalign: gdouble, yalign: gdouble): Unit = extern

//  @inline final def scrollToIter
}

object GtkTextView {
  /**
   * Creates a new GtkTextView widget displaying the given buffer.
   * One buffer can be shared among many widgets.
   *
   * @param buffer GtkTextBuffer; may be null to create a default buffer.
   */
  @name("gtk_text_view_new_with_buffer")
  def withBuffer(buffer: GtkTextBuffer): GtkTextView = extern
}
