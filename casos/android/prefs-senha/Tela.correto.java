// correto: sentinel-android-prefs-senha-em-claro
import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(String tokenCurto) {
    getSharedPreferences("p", MODE_PRIVATE).edit().putString("sessao", tokenCurto).apply();
  }
}
