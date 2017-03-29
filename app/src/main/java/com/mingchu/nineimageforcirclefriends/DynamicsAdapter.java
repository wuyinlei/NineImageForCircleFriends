package com.mingchu.nineimageforcirclefriends;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mingchu.nineimageforcirclefriends.bean.CircleDataBean.DataBean.ListBean;
import com.mingchu.nineimageforcirclefriends.nineimage.ImageInfo;
import com.mingchu.nineimageforcirclefriends.nineimage.NineGridClickViewAdapter;
import com.mingchu.nineimageforcirclefriends.nineimage.NineGridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyinlei on 2017/3/17.
 *
 * 适配器
 */

public class DynamicsAdapter extends BaseAdapter {

    private List<ListBean> mListBeen = new ArrayList<>();

    String foodId;


    /**
     * 设置数据
     *
     * @param listBeen 数据集合
     */
    public void setListBeen(List<ListBean> listBeen) {
        mListBeen = listBeen;
        notifyDataSetChanged();
    }

    /**
     * 加载更多数据
     *
     * @param listBeen 上拉加载更多的时候的请求回来的数据
     */
    public void setLoadMoreBean(List<ListBean> listBeen) {
        for (ListBean bean : listBeen) {
            mListBeen.add(bean);
        }
        notifyDataSetChanged();
    }

    private Context mContext;

    public DynamicsAdapter(Context context) {
        mContext = context;
    }

    public void lodaMoreData(List<ListBean> list) {
        if (list != null) {
            for (ListBean listBean : list) {
                mListBeen.add(listBean);
            }
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        return mListBeen == null ? 0 : mListBeen.size();
    }

    @Override
    public Object getItem(int position) {
        return mListBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Context context = parent.getContext();

        ViewHolder holder = null;
        if (convertView == null) {

            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_dynamics_adapter_layout, null);
            holder = new ViewHolder();

            holder.nineGrid = (NineGridView) convertView.findViewById(R.id.nineGrid);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        final ListBean bean = mListBeen.get(position);

        //也就是用户发朋友圈的那种,添加图片
        final List<String> images = new ArrayList<>();
        List<ImageInfo> imageInfos = new ArrayList<>();
        if (bean.getPiclist() != null) {
            holder.nineGrid.setVisibility(View.VISIBLE);
            List<ListBean.PiclistBean> piclist = bean.getPiclist();
            for (ListBean.PiclistBean piclistBean : piclist) {

                ImageInfo info = new ImageInfo();
                info.setThumbnailUrl(piclistBean.getPicurl());
                //大图
                info.setBigImageUrl(piclistBean.getPicurl_photo());
                imageInfos.add(info);
            }
        }
        holder.nineGrid.setAdapter(new NineGridClickViewAdapter(mContext, imageInfos));

        return convertView;
    }


    /**
     * 用户个人页面
     */
    private void enterUserCenter(String foodId) {
    }

    class ViewHolder {

        RelativeLayout mRelativeLayout;


        Button bt_zan_animation, //点赞动画按钮
                bt_attention; //关注
        View view_blank1;  //下划线

        CircleImageView userimage; //用户名
        TextView username,  //用户姓名
                company_place, //公司
                tv_shu, //竖杠
                user_post, //
                publish_time, //发布时间
                attention_zan, //点赞按钮
                attention_comment,  //评论数
                tv_zan_past,  //点赞过了
                tv_topic_comment_count_more,  //评论+
                tv_topic_zan_count_more, //点赞+
                tv_animation_add; //

        RelativeLayout view_comment,  //评论布局
                view_zan,  //赞布局
                view_zan_animation;  //赞动画布局

        Button bt_comment,  //评论图片
                bt_zan; //点赞图片

        TextView content;  //用户发布的内容
        NineGridView nineGrid;  //九宫格图片

        RecyclerView recycler_comment_view;  //二级评论

        LinearLayout look_more;  //查看更多的根布局
        TextView tv_look_more;  //查看更多的提示
    }
}
