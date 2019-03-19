package com.hzy.lock.listener

import com.hzy.lock.PatternLockView

/**
 * The callback interface for detecting patterns entered by the user
 * @author: ziye_huang
 * @date: 2019/3/18
 */
interface PatternLockViewListener {
    /**
     * Fired when the pattern drawing has just started
     */
    fun onStarted()

    /**
     * Fired when the pattern is still being drawn and progressed to
     * one more [com.hzy.lock.PatternLockView.Dot]
     */
    fun onProgress(progressPattern: List<PatternLockView.Dot>)

    /**
     * Fired when the user has completed drawing the pattern and has moved their finger away
     * from the view
     */
    fun onComplete(pattern: List<PatternLockView.Dot>)

    /**
     * Fired when the patten has been cleared from the view
     */
    fun onCleared()
}