import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(String senha) {
    // alvo: sentinel-android-prefs-senha-em-claro
    getSharedPreferences("p", MODE_PRIVATE).edit().putString("senha", senha).apply();
  }
}
