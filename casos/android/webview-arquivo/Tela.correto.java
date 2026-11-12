// correto: sentinel-android-webview-acesso-arquivo
import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(WebView w) {
    w.getSettings().setAllowFileAccess(false);
  }
}
