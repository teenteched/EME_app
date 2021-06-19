package com.example.teenteched;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LessonActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_main);
    }

    public void openSection(View v) {
        String video_name = "section_" + v.getTag();
        Resources res = getResources();
        int video_id = res.getIdentifier(video_name, "raw", getPackageName());

        FragmentManager fm = getSupportFragmentManager();
        VideoFragment videoFragment = VideoFragment.newInstance(video_id);
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView, videoFragment);
        ft.commit();
    }

    public void openVocab(View v) {
        FragmentManager fm = getSupportFragmentManager();
        ScrollingFragment scrollingFragment = new ScrollingFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView, scrollingFragment);
        ft.commit();
    }

    public void openExcercise(View v) {
        FragmentManager fm = getSupportFragmentManager();
        ExcerciseFragment excerciseFragment = new ExcerciseFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView, excerciseFragment);
        ft.commit();
    }
}
