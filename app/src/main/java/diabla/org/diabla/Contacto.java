package diabla.org.diabla;

/**
 * Created by T-101 on 9/2/2018.
 */
public class Contacto {

    /**
     * Lista de contactos ficticios
     */
    public static final Contacto[] CONTACTOS = {
            new Contacto("Juan"),
            new Contacto("Ana"),
            new Contacto("Pedro"),
            new Contacto("Maria"),

    };


    public static final String ID = "id_contacto";


    public static final int INVALID_ID = -1;


    private final String mNombre;


    public Contacto(String nombre) {
        mNombre = nombre;
    }



    public static Contacto porId(int id) {
        return CONTACTOS[id];
    }


    public String getNombre() {
        return mNombre;
    }


    public int getIcon() {
        return R.mipmap.reddit;
    }

}

