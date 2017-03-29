# NineImageForCircleFriends朋友圈九宫格

标签（空格分隔）： 开源项目

---
###需求
* 当只有一张的时候,显示一张图片(宽度是整个手机宽度(去掉左右margin和padding值))
* 当有两张和四张图片的时候,图片的宽度是整个宽度的1/2,当然要剔除margin和padding值
* 当图片是3,5,6,7,8,9张的时候,显示的是类似于微信九宫格的图片

###主要的测量方法
```
 @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = 0;
        int totalWidth = width - getPaddingLeft() - getPaddingRight();
        if (mImageInfo != null && mImageInfo.size() > 0) {
            if (mImageInfo.size() == 1) {
                gridWidth = singleImageSize > totalWidth ? totalWidth : singleImageSize;
                gridHeight = (int) (gridWidth / singleImageRatio);
                //矫正图片显示区域大小，不允许超过最大显示范围
                if (gridHeight > singleImageSize) {
                    float ratio = singleImageSize * 1.0f / gridHeight;
                    gridWidth = (int) (gridWidth * ratio);
                    gridHeight = singleImageSize;
                }
            } else if (mImageInfo.size() == 2 || mImageInfo.size() == 4) {

                //如果当为2张或者4张图片的时候   就按照总宽度的  1/2
                gridWidth = gridHeight = (totalWidth - gridSpacing * (columnCount - 1)) / columnCount;
                //这里无论是几张图片，宽高都按总宽度的 1/3
//                gridWidth = gridHeight = (totalWidth - gridSpacing ) / 2;
            } else {
                gridWidth = gridHeight = (totalWidth - gridSpacing * 2) / 3;
            }
            width = gridWidth * columnCount + gridSpacing * (columnCount - 1) + getPaddingLeft() + getPaddingRight();
            height = gridHeight * rowCount + gridSpacing * (rowCount - 1) + getPaddingTop() + getPaddingBottom();

        }
        setMeasuredDimension(width, height);
    }
```

###效果图


![](http://ww1.sinaimg.cn/mw690/006jcGvzly1fe3qba167zj30f00qo40k.jpg)


![](http://ww1.sinaimg.cn/mw690/006jcGvzly1fe3qbs7flpj30f00qo764.jpg)

###参考

https://github.com/jeasonlzy/NineGridView




