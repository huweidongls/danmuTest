package com.a99zan.zsccpsapp.danmutest.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a99zan.zsccpsapp.danmutest.R;


/**
 * 评论table
 */
public class CommentFragment extends Fragment {



    public CommentFragment() {
    }

    public static CommentFragment newInstance() {
        CommentFragment fragment = new CommentFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_comment, container, false);

        return mView;
    }


}
