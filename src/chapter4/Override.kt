package chapter4

import chapter4.Clickable

open class RichButton : Clickable {
    fun disable() {}

    open fun animate() {}

    override fun click() {}
}