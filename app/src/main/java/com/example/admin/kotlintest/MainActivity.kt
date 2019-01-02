package com.example.admin.kotlintest

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import com.appbaselib.base.BaseActivity
import com.appbaselib.ext.toast
import com.foamtrace.photopicker.PhotoPickerActivity
import com.foamtrace.photopicker.intent.PhotoPickerIntent
import com.safframework.ext.click
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.include_toolbar.*

class MainActivity : BaseActivity() {

    override fun getToolbar(): Toolbar? {
        return toolbar;
    }

    override fun initView(mSavedInstanceState: Bundle?) {

        button.click {
            //    startActivity(Intent(this, Main2Activity::class.java))
            startActivity(PhotoPickerIntent(this))

            toast("fsdf")

        }


    }

    override fun getContentViewLayoutID(): Int {
        return R.layout.activity_main

    }

    override fun getLoadingTargetView(): View? {
        return null
    }


}
