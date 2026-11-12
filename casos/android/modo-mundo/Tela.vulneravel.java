import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a() {
    // alvo: sentinel-android-modo-mundo
    getSharedPreferences("dados", MODE_WORLD_READABLE);
  }
}
