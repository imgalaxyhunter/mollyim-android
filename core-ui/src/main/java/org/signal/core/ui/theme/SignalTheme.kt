package org.signal.core.ui.theme

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

private val typography = Typography().run {
  copy(
    headlineLarge = headlineLarge.copy(
      fontSize = 32.sp,
      lineHeight = 40.sp,
      letterSpacing = 0.sp
    ),
    headlineMedium = headlineMedium.copy(
      fontSize = 28.sp,
      lineHeight = 36.sp,
      letterSpacing = 0.sp
    ),
    titleLarge = titleLarge.copy(
      fontSize = 22.sp,
      lineHeight = 28.sp,
      letterSpacing = 0.sp
    ),
    titleMedium = titleMedium.copy(
      fontSize = 18.sp,
      lineHeight = 24.sp,
      letterSpacing = 0.0125.sp,
      fontFamily = FontFamily.SansSerif,
      fontStyle = FontStyle.Normal
    ),
    titleSmall = titleSmall.copy(
      fontSize = 16.sp,
      lineHeight = 22.sp,
      letterSpacing = 0.0125.sp
    ),
    bodyLarge = bodyLarge.copy(
      fontSize = 16.sp,
      lineHeight = 22.sp,
      letterSpacing = 0.0125.sp
    ),
    bodyMedium = bodyMedium.copy(
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.0107.sp
    ),
    bodySmall = bodySmall.copy(
      fontSize = 13.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.0192.sp
    ),
    labelLarge = labelLarge.copy(
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.0107.sp
    ),
    labelMedium = labelMedium.copy(
      fontSize = 13.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.0192.sp
    ),
    labelSmall = labelSmall.copy(
      fontSize = 12.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.025.sp
    )
  )
}

private val lightColorScheme = lightColorScheme(
  primary = Color(0xFF5335DD),
  primaryContainer = Color(0xFFBEAFFF),
  secondary = Color(0xFF5A5379),
  secondaryContainer = Color(0xFFCCBFFF),
  surface = Color(0xFFF6F6FF),
  surfaceVariant = Color(0xFFEAE5FF),
  background = Color(0xFFF6F6FF),
  error = Color(0xFFDB2B2E),
  errorContainer = Color(0xFFFFDEDF),
  onPrimary = Color(0xFFFFFFFF),
  onPrimaryContainer = Color(0xFF190A5C),
  onSecondary = Color(0xFFFFFFFF),
  onSecondaryContainer = Color(0xFF190A5C),
  onSurface = Color(0xFF190A5C),
  onSurfaceVariant = Color(0xFF5E519D),
  onBackground = Color(0xFF190A5C),
  outline = Color(0xFF9384E2)
)

private val lightExtendedColors = ExtendedColors(
  neutralSurface = Color(0x99FFFFFF),
  colorOnCustom = Color(0xFFFFFFFF),
  colorOnCustomVariant = Color(0xB3FFFFFF),
  colorSurface1 = Color(0xFFEAE5FF),
  colorSurface2 = Color(0xFFEAE5FF),
  colorSurface3 = Color(0xFFEAE5FF),
  colorSurface4 = Color(0xFFEAE5FF),
  colorSurface5 = Color(0xFFEAE5FF),
  colorTransparent1 = Color(0x14FFFFFF),
  colorTransparent2 = Color(0x29FFFFFF),
  colorTransparent3 = Color(0x8FFFFFFF),
  colorTransparent4 = Color(0xB8FFFFFF),
  colorTransparent5 = Color(0xF5FFFFFF),
  colorNeutral = Color(0xFFFFFFFF),
  colorNeutralVariant = Color(0xB8FFFFFF),
  colorTransparentInverse1 = Color(0x0A000000),
  colorTransparentInverse2 = Color(0x14000000),
  colorTransparentInverse3 = Color(0x66000000),
  colorTransparentInverse4 = Color(0xB8000000),
  colorTransparentInverse5 = Color(0xE0000000),
  colorNeutralInverse = Color(0xFF121212),
  colorNeutralVariantInverse = Color(0xFF5C5C5C)
)

private val darkExtendedColors = ExtendedColors(
  neutralSurface = Color(0x14FFFFFF),
  colorOnCustom = Color(0xFFFFFFFF),
  colorOnCustomVariant = Color(0xB3FFFFFF),
  colorSurface1 = Color(0xFF281E57),
  colorSurface2 = Color(0xFF281E57),
  colorSurface3 = Color(0xFF281E57),
  colorSurface4 = Color(0xFF281E57),
  colorSurface5 = Color(0xFF281E57),
  colorTransparent1 = Color(0x0AFFFFFF),
  colorTransparent2 = Color(0x1FFFFFFF),
  colorTransparent3 = Color(0x29FFFFFF),
  colorTransparent4 = Color(0x7AFFFFFF),
  colorTransparent5 = Color(0xB8FFFFFF),
  colorNeutral = Color(0xFF121212),
  colorNeutralVariant = Color(0xFF5C5C5C),
  colorTransparentInverse1 = Color(0x0A000000),
  colorTransparentInverse2 = Color(0x14000000),
  colorTransparentInverse3 = Color(0x29000000),
  colorTransparentInverse4 = Color(0xB8000000),
  colorTransparentInverse5 = Color(0xF5000000),
  colorNeutralInverse = Color(0xE0FFFFFF),
  colorNeutralVariantInverse = Color(0xA3FFFFFF)
)

private val darkColorScheme = darkColorScheme(
  primary = Color(0xFFAA98FF),
  primaryContainer = Color(0xFF4028AF),
  secondary = Color(0xFFB3ABDA),
  secondaryContainer = Color(0xFF423290),
  surface = Color(0xFF130F26),
  surfaceVariant = Color(0xFF281E57),
  background = Color(0xFF130F26),
  error = Color(0xFFFFB4A9),
  errorContainer = Color(0xFF930006),
  onPrimary = Color(0xFF130F26),
  onPrimaryContainer = Color(0xFFEAE5FF),
  onSecondary = Color(0xFF36304F),
  onSecondaryContainer = Color(0xFFEAE5FF),
  onSurface = Color(0xFFEAE5FF),
  onSurfaceVariant = Color(0xFFBEB1FF),
  onBackground = Color(0xFFEAE5FF),
  outline = Color(0xFF6E5DB9)
)

private val lightSnackbarColors = SnackbarColors(
  color = darkColorScheme.surface,
  contentColor = darkColorScheme.onSurface,
  actionColor = darkColorScheme.primary,
  actionContentColor = darkColorScheme.primary,
  dismissActionContentColor = darkColorScheme.onSurface
)

private val darkSnackbarColors = SnackbarColors(
  color = darkColorScheme.surfaceVariant,
  contentColor = darkColorScheme.onSurfaceVariant,
  actionColor = darkColorScheme.primary,
  actionContentColor = darkColorScheme.primary,
  dismissActionContentColor = darkColorScheme.onSurfaceVariant
)

@Composable
fun SignalTheme(
  isDarkMode: Boolean = LocalContext.current.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES,
  content: @Composable () -> Unit
) {
  val extendedColors = if (isDarkMode) darkExtendedColors else lightExtendedColors
  val snackbarColors = if (isDarkMode) darkSnackbarColors else lightSnackbarColors

  CompositionLocalProvider(LocalExtendedColors provides extendedColors, LocalSnackbarColors provides snackbarColors) {
    MaterialTheme(
      colorScheme = if (isDarkMode) darkColorScheme else lightColorScheme,
      typography = typography,
      content = content
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun TypographyPreview() {
  SignalTheme(isDarkMode = false) {
    Column {
      Text(
        text = "Headline Small",
        style = MaterialTheme.typography.headlineLarge
      )
      Text(
        text = "Headline Small",
        style = MaterialTheme.typography.headlineMedium
      )
      Text(
        text = "Headline Small",
        style = MaterialTheme.typography.headlineSmall
      )
      Text(
        text = "Title Large",
        style = MaterialTheme.typography.titleLarge
      )
      Text(
        text = "Title Medium",
        style = MaterialTheme.typography.titleMedium
      )
      Text(
        text = "Title Small",
        style = MaterialTheme.typography.titleSmall
      )
      Text(
        text = "Body Large",
        style = MaterialTheme.typography.bodyLarge
      )
      Text(
        text = "Body Medium",
        style = MaterialTheme.typography.bodyMedium
      )
      Text(
        text = "Body Small",
        style = MaterialTheme.typography.bodySmall
      )
      Text(
        text = "Label Large",
        style = MaterialTheme.typography.labelLarge
      )
      Text(
        text = "Label Medium",
        style = MaterialTheme.typography.labelMedium
      )
      Text(
        text = "Label Small",
        style = MaterialTheme.typography.labelSmall
      )
    }
  }
}

object SignalTheme {
  val colors: ExtendedColors
    @Composable
    get() = LocalExtendedColors.current
}
