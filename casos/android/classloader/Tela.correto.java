// correto: sentinel-android-classloader-armazenamento-externo
import android.content.*;
import android.os.Environment;
import dalvik.system.DexClassLoader;
import java.io.File;
class Tela extends android.app.Activity {
  void a(Context ctx) {
    new DexClassLoader(ctx.getFilesDir() + "/plugin.dex", ctx.getCodeCacheDir().getPath(), null, ctx.getClassLoader());
  }
}
