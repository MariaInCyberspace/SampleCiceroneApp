package maria.incyberspace.test

import androidx.core.os.bundleOf
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun fragmentA(t: String = "") = FragmentScreen { FragmentA().apply { arguments = bundleOf("FragA" to t) } }
    fun fragmentB(t: String = "") = FragmentScreen { FragmentB().apply { arguments = bundleOf("Text" to t) } }
}