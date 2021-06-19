package com.example.teenteched;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_main);

        MediaController mediaController = new MediaController(this);
        VideoView introVideoView = (VideoView) findViewById(R.id.introVideoView);
        introVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
        introVideoView.setMediaController(mediaController);
        introVideoView.start();
    }

    public void openLesson(View v) {
        startActivity(new Intent(CourseActivity.this, LessonActivity.class));
    }


}
