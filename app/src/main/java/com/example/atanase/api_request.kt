package com.example.atanase

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.atanase.data.TestAPI
import com.example.atanase.data.TestAPI.Companion.getPosts
import com.example.atanase.data.response.test_responseItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

private val CoroutineScope.textView: Any
    get() {}

class PostsTest {
     fun onActivityCreated(savedInstaceState: Bundle?) {
        val apiTester = TestAPI()

        GlobalScope.launch(Dispatchers.Main) {
            CoroutineScope()
            val postsResponse = getPosts().await()
            textView.text = test_responseItem.getPosts.toString()

        }
    }
}