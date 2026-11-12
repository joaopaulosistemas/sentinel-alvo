import android.content.ContentProvider;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
class Provedor extends ContentProvider {
  // alvo: sentinel-android-provider-openfile-caminho
  public ParcelFileDescriptor openFile(Uri uri, String mode) throws java.io.FileNotFoundException {
    File f = new File(getContext().getFilesDir(), uri.getLastPathSegment());
    return ParcelFileDescriptor.open(f, ParcelFileDescriptor.MODE_READ_ONLY);
  }
}
