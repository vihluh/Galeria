package isabel.vitoria.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import isabel.vitoria.galeria.R;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Toolbar toolbar= findViewById(R.id.tbPhoto); //obtem o elemento tbPhoto
        setSupportActionBar(toolbar); //indica que deve ser considerado como a ActionBar padrão da tela

        ActionBar actionBar = getSupportActionBar(); //obtém a ActionBar padrã0
        actionBar.setDisplayHomeAsUpEnabled(true); //habilita o botão de voltar na ActionBar
    }
}