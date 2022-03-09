package com.socks.sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.socks.library.KLog
import java.util.*

class KotlinTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_test)
        val test = this.findViewById(R.id.test_btn) as TextView
        test.setOnClickListener {
            KLog.d("tag", "Kotlin log测试")
            KLog.d("Kotlin log测试" as Any)
            val a=1
            KLog.d(a)
        }
    }

    fun d(tag: String?, vararg objects: Any?) {

    }

    fun d(tag: String?) {


    }
}