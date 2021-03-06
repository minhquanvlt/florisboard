package dev.patrickgold.florisboard.ime.layout

import android.annotation.SuppressLint
import com.squareup.moshi.FromJson
import java.lang.Error

/**
 * Defines the type of the layout.
 */
enum class LayoutType {
    CHARACTERS,
    CHARACTERS_MOD,
    EXTENSION,
    NUMERIC,
    SYMBOLS,
    SYMBOLS_MOD,
    SYMBOLS2,
    SYMBOLS2_MOD;

    @SuppressLint("DefaultLocale")
    override fun toString(): String {
        return super.toString().replace("_", "/").toLowerCase()
    }

    companion object {
        @SuppressLint("DefaultLocale")
        fun fromString(string: String): LayoutType {
            return valueOf(string.replace("/", "_").toUpperCase())
        }
    }
}

class LayoutTypeAdapter {
    @FromJson
    fun fromJson(raw: String): LayoutType {
        return LayoutType.fromString(raw)
    }
}
