package isabel.vitoria.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;


import isabel.vitoria.galeria.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tbMain); //obtem o elemento tbPhoto
        setSupportActionBar(toolbar); //indica que deve ser considerado como a ActionBar padrão da tela
    }
}