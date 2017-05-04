package com.example.prabhusivanandam.welcomecordinator;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Prabhu Sivanandam on 04-May-17.
 */

public class Adapter extends PagerAdapter {
    int resource[] ={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6};
    private Context ctx;
    LayoutInflater inflator;
    public Adapter(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return resource.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflator=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inflator.inflate(R.layout.swiper_layout,container,false);
        ImageView img=(ImageView)v.findViewById(R.id.img);
        img.setImageResource(resource[position]);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }
}
