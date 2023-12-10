package maria.incyberspace.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.github.terrakok.cicerone.Screen
import maria.incyberspace.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNavigator()
        setButtonOnClickListener()
        observeCurrentScreen()
    }

    private fun observeCurrentScreen() {
        viewModel.currentScreen.observe(this) {
            startFragment(it)
        }
    }

    private fun setButtonOnClickListener() {
        with (binding) {
            switchFragmentsButton.setOnClickListener {
                viewModel.switchFragments()
            }
        }
    }

    private fun startFragment(s: Screen) {
        viewModel.startFragment(screen = s)
    }

    private fun setNavigator() {
        viewModel.setNavigator(this)
    }

}