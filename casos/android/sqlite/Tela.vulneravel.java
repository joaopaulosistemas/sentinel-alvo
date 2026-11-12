import android.content.*;
import android.util.Log;
import android.webkit.*;
class Tela extends android.app.Activity {
  void a(android.database.sqlite.SQLiteDatabase db, String nome) {
    // alvo: sentinel-android-sqlite-concatenado
    db.rawQuery("SELECT * FROM cliente WHERE nome = '" + nome + "'", null);
  }
}
