package maria.incyberspace.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.AppNavigator
import maria.incyberspace.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val router = CiceroneNavigation.router

    private lateinit var binding: ActivityMainBinding
    private var isFragmentB = false
    private var textFromFragB = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setNavigator()
        startFragment()
        setButtonOnClickListener()
    }

    private fun setButtonOnClickListener() {
        with (binding) {
            switchFragmentsButton.setOnClickListener {
                isFragmentB = if (isFragmentB) {
                    startFragment(Screens.fragmentA(textFromFragB))
                    false
                } else {
                    getTextFromFragB()
                    startFragment(Screens.fragmentB(StringsSource.randomText()))
                    true
                }
            }
        }
    }

    private fun getTextFromFragB() {
        router.setResultListener("FragA") {
            textFromFragB = it as String
        }
    }

    private fun setNavigator() {
        CiceroneNavigation.setNavigator(AppNavigator(this, R.id.fragment_container_view))
    }

    private fun startFragment(s: Screen = Screens.fragmentA()) {
        router.replaceScreen(s)
    }

}