package maria.incyberspace.test

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.androidx.AppNavigator

object CiceroneNavigation {
    private val cicerone = Cicerone.create()
    val router get() = cicerone.router
    private val navigatorHolder get() = cicerone.getNavigatorHolder()
    fun setNavigator(n: AppNavigator) { navigatorHolder.setNavigator(n) }
}