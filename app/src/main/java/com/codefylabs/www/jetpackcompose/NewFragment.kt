package com.codefylabs.www.jetpackcompose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy

class NewFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        Option 2:
//        return ComposeView(requireContext()).apply {
//
//            setViewCompositionStrategy(
//                ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
//            )
//
//            setContent {
//                HelloFromFragment()
//            }
//        }

        return inflater.inflate(R.layout.fragment_new, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        // Option 3
//        val composeView = view?.findViewById<ComposeView>(R.id.compose_view)
//        composeView?.apply {
//            setContent {
//                HelloFromFragment()
//            }
//        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = NewFragment()
    }
}

@Composable
fun HelloFromFragment() {
    Text(text = "Hello From Fragment")
}