package org.tinker.codex.utils

import java.lang.RuntimeException

open class BitStatus {
    companion object {
        fun bitPow(power: Int): Long {
            var result = 1L
            when (power) {
                //if power = 0
                0 -> result = 1
                //if power <=63 && power >=1
                in 1..63 -> for (i in 1..power) {
                    result *= 2
                }
                else -> throw RuntimeException("参数取值: 0-63")
            }
            return result
        }

        fun toArray(str: String): Array<String> {
            var i = 0
            var split1 = str.split(",")
            var result = Array(split1.size) { "" }
            split1.forEach { status ->
                result[i++] = status.split("=")[0]
            }
            return result
        }

        fun toString(array: Array<String>): String {
            var sb = StringBuffer()
            var i = 0
            array.forEach { element ->
                sb.append("${element}=2^${i++},")
            }
            return sb.toString().substring(0, sb.length - 1)
        }
    }
}