package diabla.org.diabla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.enviar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //dentro de la clase interna anonima
                Toast.makeText(getApplicationContext(),"tu mensaje se envia",Toast.LENGTH_LONG).show();
            }
        });
    }
}
