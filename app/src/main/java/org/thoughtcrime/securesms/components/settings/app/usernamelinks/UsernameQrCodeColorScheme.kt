package org.thoughtcrime.securesms.components.settings.app.usernamelinks

import androidx.compose.ui.graphics.Color

/**
 * A set of color schemes for sharing QR codes.
 */
enum class UsernameQrCodeColorScheme(
  val borderColor: Color,
  val foregroundColor: Color,
  val backgroundColor: Color,
  val textColor: Color = Color.White,
  val outlineColor: Color = Color.Transparent,
  private val key: String
) {
  Blue(
    // MOLLY: Blue is the new Purple
    borderColor = Color(0xFF7152FF),
    foregroundColor = Color(0xFF5335DD),
    backgroundColor = Color(0xFFEAE5FF),
    key = "blue"
  ),
  White(
    borderColor = Color(0xFFFFFFFF),
    foregroundColor = Color(0xFF000000),
    backgroundColor = Color(0xFFF5F5F5),
    textColor = Color.Black,
    outlineColor = Color(0xFFE9E9E9),
    key = "white"
  ),
  Grey(
    borderColor = Color(0xFF6A6C74),
    foregroundColor = Color(0xFF464852),
    backgroundColor = Color(0xFFF0F0F1),
    key = "grey"
  ),
  Tan(
    borderColor = Color(0xFFBBB29A),
    foregroundColor = Color(0xFF73694F),
    backgroundColor = Color(0xFFF6F5F2),
    key = "tan"
  ),
  Green(
    borderColor = Color(0xFF97AA89),
    foregroundColor = Color(0xFF55733F),
    backgroundColor = Color(0xFFF2F5F0),
    key = "green"
  ),
  Orange(
    borderColor = Color(0xFFDE7134),
    foregroundColor = Color(0xFFDA6C2E),
    backgroundColor = Color(0xFFFCF1EB),
    key = "orange"
  ),
  Pink(
    borderColor = Color(0xFFEA7B9D),
    foregroundColor = Color(0xFFBB617B),
    backgroundColor = Color(0xFFFCF1F5),
    key = "pink"
  ),
  Purple(
    // MOLLY: Purple is upstream Blue (CD->CC to avoid replace conflicts)
    borderColor = Color(0xFF506ECC),
    foregroundColor = Color(0xFF2449C0),
    backgroundColor = Color(0xFFEDF0FA),
    key = "purple"
  );

  fun serialize(): String {
    return key
  }

  companion object {
    /**
     * Returns the [UsernameQrCodeColorScheme] based on the serialized string. If no match is found, the default of [Blue] is returned.
     */
    @JvmStatic
    fun deserialize(serialized: String?): UsernameQrCodeColorScheme {
      return entries.firstOrNull { it.key == serialized } ?: Blue
    }
  }
}
