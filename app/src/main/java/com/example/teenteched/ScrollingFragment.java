package com.example.teenteched;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

public class ScrollingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_scrolling, container, false);
        LinearLayout vocabList = (LinearLayout) v.findViewById(R.id.vocab_list);
        Resources res = getResources();
        for (int i = 0; i < 25; i++) {
            String file_name = "vocabulary_page_" + i;
            int id = res.getIdentifier(file_name, "drawable", getActivity().getPackageName());
            ImageView imageView = new ImageView(getActivity());
            imageView.setAdjustViewBounds(true);
            imageView.setImageResource(id);
            vocabList.addView(imageView, i);
        }
        return v;
    }
}