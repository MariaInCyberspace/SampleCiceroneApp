package maria.incyberspace.test

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.AppNavigator

private const val FRAGMENT_A_KEY = "FragA"
class MainViewModel : ViewModel() {
    private val router = CiceroneNavigation.router

    private var _currentScreen = MutableLiveData<Screen>().apply {
        value = Screens.fragmentA()
    }
    val currentScreen: LiveData<Screen> = _currentScreen

    private var isFragmentB = false

    private var textFromFragB = ""

    fun startFragment(screen: Screen) {
        router.replaceScreen(screen)
    }

    fun switchFragments() {
        isFragmentB = if (isFragmentB) {
            with (Screens.fragmentA(textFromFragB)) {
                startFragment(screen = this)
                _currentScreen.value = this
            }
            false
        } else {
            getTextFromFragB()
            with (Screens.fragmentB(StringsSource.randomText())) {
                startFragment(screen = this)
                _currentScreen.value = this
            }
            true
        }
    }
    private fun getTextFromFragB() {
        router.setResultListener(FRAGMENT_A_KEY) {
            textFromFragB = it as String
        }
    }

    fun setNavigator(activity: AppCompatActivity) {
        CiceroneNavigation.setNavigator(AppNavigator(activity, R.id.fragment_container_view))
    }

}