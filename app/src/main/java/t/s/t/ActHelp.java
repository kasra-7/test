package t.s.t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ActHelp extends AppCompatActivity {
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_help);

        video = findViewById(R.id.video);

        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.myvideo);
        MediaController controller = new MediaController(this);
        controller.setAnchorView(video);
        video.start();
        video.setMediaController(controller);

    }
}