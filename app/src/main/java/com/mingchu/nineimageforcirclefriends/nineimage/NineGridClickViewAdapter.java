package com.mingchu.nineimageforcirclefriends.nineimage;

import android.content.Context;

import java.util.List;


/**
 * Created by wuyinlei on 2017/3/21.
 *
 */

public class NineGridClickViewAdapter extends NineGridViewAdapter {
    private int statusHeight;

    public NineGridClickViewAdapter(Context context, List<ImageInfo> imageInfo) {
        super(context, imageInfo);
        statusHeight = getStatusHeight(context);
    }

    @Override
    protected void onImageItemClick(Context context, NineGridView nineGridView, int index, List<ImageInfo> imageInfo) {

        String name = imageInfo.get(0).getName();

//        ArrayList<Food.Data.Piclist> piclist = new ArrayList<>();
//
//        for (ImageInfo info : imageInfo) {
//            Food.Data.Piclist data = new Food.Data.Piclist();
//            data.foodurl = info.getThumbnailUrl();
//            data.foodurl_photo = info.getBigImageUrl();
//            data.imgname = info.getName();
//            piclist.add(data);
//        }
//        Intent intent = new Intent(context, FoodImageActivity.class);
//        intent.putExtra("position", index + "");
//        intent.putExtra("name", name);
//        //传递一个对象数组
//        Bundle bu = new Bundle();
//        bu.putSerializable("piclist", (Serializable) piclist);
//        intent.putExtras(bu);
//        context.startActivity(intent);
    }

    /**
     * 获得状态栏的高度
     */
    public int getStatusHeight(Context context) {
        int statusHeight = -1;
        try {
            Class<?> clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            int height = Integer.parseInt(clazz.getField("status_bar_height").get(object).toString());
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }


}
