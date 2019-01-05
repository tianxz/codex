package org.tinker.codex.utils

open class Str {
    companion object {
        fun merge(value: String, vararg args: String): String {
            var tempValue = value
            tempValue = tempValue.replace("{}", "%s")
            return String.format(tempValue, *args)
        }
    }
}