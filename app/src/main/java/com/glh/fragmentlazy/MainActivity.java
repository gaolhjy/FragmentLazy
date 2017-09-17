package com.glh.fragmentlazy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.glh.fragmentlazy.lazyFragment.LazyFragmentA;
import com.glh.fragmentlazy.lazyFragment.LazyFragmentB;
import com.glh.fragmentlazy.lazyFragment.LazyFragmentC;
import com.glh.fragmentlazy.lazyFragment.LazyFragmentD;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设定适配器
        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);

        List<Fragment> fragments = new ArrayList<Fragment>();

       /* *****     默认加载的fragment     *******  */
        //        fragments.add(new FragmentA());
        //        fragments.add(new FragmentB());
        //        fragments.add(new FragmentC());
        //        fragments.add(new FragmentD());


        /* *****    赖加载的fragment     *******  */
        fragments.add(new LazyFragmentA());
        fragments.add(new LazyFragmentB());
        fragments.add(new LazyFragmentC());
        fragments.add(new LazyFragmentD());


        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(adapter);
        // 控制缓存页面的代码.当数目大于等于1时,才有效.如果要实现赖加载,
        // 必须从fragment的setUserVisibleHint着手

        //        vp.setOffscreenPageLimit(2);


    }
}



