package t.s.t;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ActSplash extends AppCompatActivity {
    Transition tr;
    ViewGroup root;
    ImageView img_sp;
    TextView tv_sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);

        root = findViewById(R.id.root);
        img_sp = findViewById(R.id.img_sp);
        tv_sp = findViewById(R.id.tv_sp);

        spTransition(Gravity.TOP, View.VISIBLE, 100);

        spTransition(Gravity.BOTTOM, View.INVISIBLE, 2700);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(ActSplash.this, MainActivity.class));
            finish();
        }, 3900);
    }


    private void spTransition(int gravity, int visible, int time) {
        new Handler().postDelayed(() -> {
            tr = new Slide(gravity);
            tr.setDuration(1200);
            TransitionManager.beginDelayedTransition(root, tr);
            img_sp.setVisibility(visible);
            tv_sp.setVisibility(visible);
        }, time);
    }
}