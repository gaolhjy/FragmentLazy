package com.glh.fragmentlazy.defaultFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.glh.fragmentlazy.R;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2016/09/16
 *     desc   : 第一个fragment(默认情况的)
 * </pre>
 */


public class FragmentA extends Fragment {

    private static String TAG = "FragmentA========>";


    @Override
    public void onAttach(Context context) {
        Log.e(TAG, "生命周期: " + "onAttch");
        super.onAttach(context);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "生命周期: " + "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e(TAG, "生命周期: " + "onCreateView");
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "生命周期: " + "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG, "生命周期: " + "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(TAG, "生命周期: " + "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "生命周期: " + "onPause");
        super.onPause();
    }


    @Override
    public void onStop() {
        Log.e(TAG, "生命周期: " + "onStop");
        super.onStop();
    }


    @Override
    public void onDestroyView() {
        Log.e(TAG, "生命周期: " + "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "生命周期: " + "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "生命周期: " + "onDetach");
        super.onDetach();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        Log.e(TAG, "该界面是否可见: " + isVisibleToUser);
        super.setUserVisibleHint(isVisibleToUser);
    }
}