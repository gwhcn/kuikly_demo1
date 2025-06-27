package com.test.kuikly_demo1

import com.test.kuikly_demo1.base.BasePager
import com.tencent.kuikly.compose.foundation.layout.Box
import com.tencent.kuikly.compose.foundation.layout.fillMaxSize
import com.tencent.kuikly.compose.material3.Text
import com.tencent.kuikly.compose.setContent
import com.tencent.kuikly.compose.ui.Alignment
import com.tencent.kuikly.compose.ui.Modifier
import com.tencent.kuikly.core.annotations.Page

@Page("HelloWorld", supportInLocal = true)
internal class HelloWorldPager : BasePager() {

    override fun willInit() {
        super.willInit()
        setContent {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("HelloWorld Compose")
            }
        }
    }
}