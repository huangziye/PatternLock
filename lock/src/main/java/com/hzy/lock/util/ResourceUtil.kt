package com.hzy.lock.util

import android.content.Context
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat


/**
 *
 * @author: ziye_huang
 * @date: 2019/3/18
 */
object ResourceUtil {

    /**
     * Get color from a resource id
     *
     * @param context  The context
     * @param colorRes The resource identifier of the color
     * @return The resolved color value
     */
    fun getColor(context: Context, @ColorRes colorRes: Int): Int {
        return ContextCompat.getColor(context, colorRes)
    }

    /**
     * Get string from a resource id
     *
     * @param context   The context
     * @param stringRes The resource identifier of the string
     * @return The string value
     */
    fun getString(context: Context, @StringRes stringRes: Int): String {
        return context.getString(stringRes)
    }

    /**
     * Get dimension in pixels from its resource id
     *
     * @param context  The context
     * @param dimenRes The resource identifier of the dimension
     * @return The dimension in pixels
     */
    fun getDimensionInPx(context: Context, @DimenRes dimenRes: Int): Float {
        return context.resources.getDimension(dimenRes)
    }
}