package com.mingchu.nineimageforcirclefriends;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mingchu.nineimageforcirclefriends.nineimage.NineGridView;

/**
 * Created by wuyinlei on 2017/3/29.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NineGridView.setImageLoader(new PicassoImageLoader());
    }



    /** Picasso 加载 */
    private class PicassoImageLoader implements NineGridView.ImageLoader {

        @Override
        public void onDisplayImage(Context context, ImageView imageView, String url) {
            Glide.with(context).load(url)//
                    .asBitmap()
                    .into(imageView);
        }

        @Override
        public Bitmap getCacheImage(String url) {
            return null;
        }
    }

}
