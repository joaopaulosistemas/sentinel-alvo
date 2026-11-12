// correto: sentinel-android-sqlite-concatenado
import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(android.database.sqlite.SQLiteDatabase db, String nome) {
    db.rawQuery("SELECT * FROM cliente WHERE nome = ?", new String[] { nome });
  }
}
