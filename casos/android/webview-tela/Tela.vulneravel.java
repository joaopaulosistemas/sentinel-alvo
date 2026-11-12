import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(WebView w, android.widget.EditText campo) {
    // alvo: sentinel-android-webview-texto-da-tela
    w.loadUrl(campo.getText().toString());
  }
}
