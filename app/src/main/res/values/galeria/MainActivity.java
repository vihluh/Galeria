package values.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import isabel.vitoria.galeria.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tbMain); //obtem o elemento tbMain
        setSupportActionBar(toolbar); //indica que deve ser considerado como a ActionBar padrão da tela
    }
}