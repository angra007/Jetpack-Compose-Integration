package com.codefylabs.www.jetpackcompose

import android.content.Context
import android.util.AttributeSet
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView

class MyComposeView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

    @Composable
    override fun Content() {
        HelloFromCustomView()
    }
}

@Composable
fun HelloFromCustomView() {
    Text(text = "Hello From Custom View")
}