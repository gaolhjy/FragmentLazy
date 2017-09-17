package com.glh.fragmentlazy.lazyFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.glh.fragmentlazy.R;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2016/09/16
 *     desc   : 第一个fragment(赖加载情况)
 * </pre>
 */


public class LazyFragmentA extends BaseLazyFragment {

    private static String TAG = "赖加载fragmentA========>";

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
    protected int getLayoutId() {
        Log.e(TAG, "生命周期: " + "onCreateView");
        return R.layout.fragment_a;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

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