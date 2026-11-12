import android.content.*;
import android.os.Environment;
import dalvik.system.DexClassLoader;
import java.io.File;
class Tela extends android.app.Activity {
  void a(Context ctx) {
    File dir = Environment.getExternalStorageDirectory();
    // alvo: sentinel-android-classloader-armazenamento-externo
    new DexClassLoader(dir + "/plugin.dex", ctx.getCodeCacheDir().getPath(), null, ctx.getClassLoader());
  }
}
