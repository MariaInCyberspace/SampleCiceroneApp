package maria.incyberspace.test

import androidx.lifecycle.ViewModel

private const val FRAGMENT_A_KEY = "FragA"
class FragmentBViewModel : ViewModel() {
    private val router = CiceroneNavigation.router
    fun sendTextToFragmentA() {
        router.sendResult(FRAGMENT_A_KEY, getRandomText())
    }
    private fun getRandomText() : String {
        return StringsSource.randomText()
    }
}