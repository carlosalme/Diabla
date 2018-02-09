package diabla.org.diabla;

/**
 * Created by T-101 on 9/2/2018.
 */
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.TextView;

/**
 * Created by campitos on 2/7/18.
 */

public class EnlazarContacto {

    //@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static void bind(Contacto contacto, TextView textView) {
        textView.setText(contacto.getNombre());
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(contacto.getIcon(), 0, 0, 0);
    }
}