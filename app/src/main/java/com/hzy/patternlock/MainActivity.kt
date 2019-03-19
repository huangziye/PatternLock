package com.hzy.patternlock

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hzy.lock.PatternLockView
import com.hzy.lock.listener.PatternLockViewListener
import com.hzy.lock.util.ResourceUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mPatternLockViewListener: PatternLockViewListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPatternLockViewListener = object : PatternLockViewListener {
            override fun onStarted() {
            }

            override fun onProgress(progressPattern: List<PatternLockView.Dot>) {
            }

            override fun onComplete(pattern: List<PatternLockView.Dot>) {
            }

            override fun onCleared() {
            }

        }
        initPatternLockView()
    }

    private fun initPatternLockView() {
        //设置横纵坐标点的个数
        mPatternLockView.setDotCount(3)
        //设置未选中点的大小
        mPatternLockView.setDotNormalSize(
            ResourceUtil.getDimensionInPx(
                this,
                R.dimen.pattern_lock_dot_size
            ) as Int
        )
        //设置选中时点的大小
        mPatternLockView.setDotSelectedSize(
            ResourceUtil.getDimensionInPx(
                this,
                R.dimen.pattern_lock_dot_selected_size
            ) as Int
        )
        //设置路径线的宽度
        mPatternLockView.setPathWidth(
            ResourceUtil.getDimensionInPx(
                this,
                R.dimen.pattern_lock_path_width
            ) as Int
        )
        //设置宽高比是否启用
        mPatternLockView.setAspectRatioEnabled(true)
        //设置宽高比
        mPatternLockView.setAspectRatio(PatternLockView.AspectRatio.ASPECT_RATIO_HEIGHT_BIAS)
        //设置View的模式
        mPatternLockView.setViewMode(PatternLockView.PatternViewMode.CORRECT)
        //设置点动画持续时间
        mPatternLockView.setDotAnimationDuration(150)

        // 设置Pat结束动画持续时间
        mPatternLockView.setPathEndAnimationDuration(100)
        //设置正确的状态颜色
        mPatternLockView.setCorrectStateColor(ResourceUtil.getColor(this, R.color.colorPrimary))
        //是否设置为隐身模式
        mPatternLockView.setInStealthMode(false)
        //设置是否启用触觉反馈
        mPatternLockView.setTactileFeedbackEnabled(true)
        //设置输入是否启用
        mPatternLockView.setInputEnabled(true)
        mPatternLockView.addPatternLockListener(mPatternLockViewListener)
    }
}
