package com.example.teenteched;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String  VIDEO_ID = "video_id";
    private int video_id = R.raw.section_1;

    public VideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param video_id Parameter
     * @return A new instance of fragment WorkSpaceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VideoFragment newInstance(int video_id) {
        VideoFragment fragment = new VideoFragment();
        Bundle args = new Bundle();
        args.putInt(VIDEO_ID, video_id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null)
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.video_fragment, container, false);
        MediaController mediaController = new MediaController(getActivity());
        VideoView introVideoView = (VideoView) v.findViewById(R.id.sectionVideoView);
        Bundle bundle = getArguments();
        if (bundle != null)
            video_id = bundle.getInt(VIDEO_ID);

        introVideoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + '/' + video_id));
        introVideoView.setMediaController(mediaController);
        introVideoView.start();
        return v;

    }
}