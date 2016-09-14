package com.example.it.slidermenu;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IT on 9/13/2016.
 */
public class CustomSwip extends PagerAdapter {
    private int[] image_resources={R.drawable.imageone,R.drawable.imagetwo,R.drawable.imagethree};
    private Context ctx;
    private LayoutInflater layoutInflater;
    public CustomSwip(Context c){
        ctx=c;
    }
    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image);
        TextView tv=(TextView) imageView.findViewById(R.id.tv);
        imageView.setImageResource(image_resources[position]);
     
            tv.setText("Image counter:" + position);

        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }


}
