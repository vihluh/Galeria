package isabel.vitoria.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import isabel.vitoria.adapter.Utils;
import isabel.vitoria.galeria.R;

public class PhotoActivity extends AppCompatActivity {

    String photoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Toolbar toolbar= findViewById(R.id.tbPhoto); //obtem o elemento tbPhoto
        setSupportActionBar(toolbar); //indica que deve ser considerado como a ActionBar padrão da tela

        ActionBar actionBar = getSupportActionBar(); //obtém a ActionBar padrã0
        actionBar.setDisplayHomeAsUpEnabled(true); //habilita o botão de voltar na ActionBar

        //obtem o caminho da foto
        Intent i = getIntent();
        photoPath = i.getStringExtra("photo_path");

        Bitmap bitmap = Utils.getBitmap(photoPath); //carrega a foto em um bitmap
        ImageView imPhoto = findViewById(R.id.imPhoto); //seta o bitmap
        imPhoto.setImageBitmap(bitmap);
    }

    //cria um inflador de menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.photo_activity_tb, menu);
        return true;
    }

    //código que compartilha a foto
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opShare:
                sharePhoto();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void sharePhoto() {
    }
}