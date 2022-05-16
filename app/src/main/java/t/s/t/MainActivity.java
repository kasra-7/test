package t.s.t;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_test, btn_help, btn_source, btn_about;
    private static final int REQUEST_SUM = 1;
    Uri uri;
    ImageView img;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test = findViewById(R.id.btn_test);
        btn_about = findViewById(R.id.btn_about);
        btn_source = findViewById(R.id.btn_source);
        btn_help = findViewById(R.id.btn_help);
        img = findViewById(R.id.img);

        btn_test.setOnClickListener(this);
        btn_help.setOnClickListener(this);
        btn_source.setOnClickListener(this);
        btn_about.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_test:
                setIntent("ActTest");
                break;

            case R.id.btn_source:
                setIntent("ActSource");
                break;

            case R.id.btn_help:
                setIntent("ActHelp");
                break;

            case R.id.btn_about:
                showImg();
        }
    }

    private void setIntent(String str) {
        String stringClass = "t.s.t." + str;
        Class<?> c = null;
        try {
            c = Class.forName(stringClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(MainActivity.this, c);
        startActivity(intent);
    }

    private void showImg(){
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_SUM);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SUM){
            if (resultCode == RESULT_OK && data != null){
                uri = data.getData();
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                    img.setImageBitmap(bitmap);
                }catch (Exception e){
                    e.getMessage();
                }
            }
        }
    }
}