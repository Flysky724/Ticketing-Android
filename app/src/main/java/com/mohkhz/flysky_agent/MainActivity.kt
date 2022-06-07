package com.mohkhz.flysky_agent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mohkhz.covid19_compose.ui.Chooser.ChooserScreen
import com.mohkhz.covid19_compose.ui.Chooser.ChooserViewModel
import com.mohkhz.flysky_agent.ui.Home.HomeScreen
import com.mohkhz.flysky_agent.ui.NewAgent.NewAgentScreen
import com.mohkhz.flysky_agent.ui.Profile.ProfileScreen
import com.mohkhz.flysky_agent.ui.Ticket.TicketScreen
import com.mohkhz.flysky_agent.ui.login.LoginScreen
import com.mohkhz.flysky_agent.ui.theme.primary
import com.mohkhz.flysky_agent_support.util.Routes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            systemUiController.setSystemBarsColor(
                color = primary
            )
            NavHost(chooseViewModel = {
                it.phoneNumber.observe(this, { value -> it.change(it.website.value!!, value) })
            })
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavHost(chooseViewModel: (ChooserViewModel) -> Unit) {

    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    val navController = rememberAnimatedNavController()

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        AnimatedNavHost(
            navController = navController,
            startDestination = Routes.CHOOSE_SCREEN
        ) {
            composable(Routes.CHOOSE_SCREEN,
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                popEnterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                }) {
                ChooserScreen(onNavigate = {
                    navController.navigate(it.route)
                }, onObserver = { chooseViewModel(it) })
            }

            composable(Routes.LOGIN_SCREEN,
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                popEnterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                }) {
                LoginScreen(onNavigate = {
                    navController.navigate(it.route)
                })
            }

            composable(Routes.HOME_SCREEN + "?uId={uId}", arguments = listOf(navArgument("") {
                defaultValue = "-"
                type = NavType.StringType
            }),
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popEnterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                }) {
                HomeScreen(onNavigate = {
                    navController.navigate(it.route)
                })
            }

            composable(Routes.PROFILE_SCREEN + "?uId={uId}", arguments = listOf(navArgument("uId") {
                defaultValue = "-"
                type = NavType.StringType
            }),
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popEnterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                }) {
                ProfileScreen(onNavigate = {
                    navController.navigate(it.route)
                }, onBack = { navController.popBackStack() })
            }

            composable(Routes.TICKET_SCREEN + "?tId={tId},uId={uId}",
                arguments = listOf(navArgument("uId") {
                    defaultValue = "-"
                    type = NavType.StringType
                }, navArgument("tId") {
                    defaultValue = "-"
                    type = NavType.StringType
                }),
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popEnterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                }) {
                TicketScreen(onNavigate = {
                    navController.navigate(it.route)
                }, onBack = { navController.popBackStack() })
            }

            composable(Routes.NEW_AGENT_SCREEN,
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popEnterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { 1000 },
                        animationSpec = tween(500)
                    )
                },
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -1000 },
                        animationSpec = tween(500)
                    )
                }) {
                NewAgentScreen(onBack = { navController.popBackStack() })
            }
        }
    }


}