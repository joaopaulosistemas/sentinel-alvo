import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(WebView w) {
    // alvo: sentinel-android-webview-acesso-arquivo
    w.getSettings().setAllowFileAccess(true);
  }
}
