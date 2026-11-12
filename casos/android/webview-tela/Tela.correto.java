// correto: sentinel-android-webview-texto-da-tela
import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(WebView w) {
    w.loadUrl("https://app.exemplo.com/home");
  }
}
