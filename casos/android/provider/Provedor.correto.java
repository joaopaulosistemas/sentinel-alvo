// correto: sentinel-android-provider-openfile-caminho
import android.content.ContentProvider;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
class Provedor extends ContentProvider {
  public ParcelFileDescriptor openFile(Uri uri, String mode) throws java.io.FileNotFoundException {
    File base = new File(getContext().getFilesDir(), "publico");
    File f = new File(base, "relatorio.pdf");
    return ParcelFileDescriptor.open(f, ParcelFileDescriptor.MODE_READ_ONLY);
  }
}
