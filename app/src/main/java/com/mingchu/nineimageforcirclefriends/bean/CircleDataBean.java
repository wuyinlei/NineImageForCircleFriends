package com.mingchu.nineimageforcirclefriends.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wuyinlei on 2017/3/29.
 * <p>
 * 朋友圈数据
 */

public class CircleDataBean implements Serializable {


    /**
     * code : 1
     * message : 成功
     * data : {"topic":{"id":"7","name":"#我们的","toppic":"http://m.greatchef.com.cn//Public/images/newfood.jpg","join_num":"0","ishot":"0","joinuserlist":[]},"list":[{"id":"20","content":"111把","uid":"64172","comment_sum":"0","addtime":"1489737040","commentnum":"0","zan":"0","ps":"0","fs":"0","piclist":[{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ab213e2.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ab213e2.jpg"},{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ad8e7c3.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ad8e7c3.jpg"},{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ac957d0.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ac957d0.jpg"}],"comments":[],"author":{"uid":"64172","nick_name":"赵赫ラーメ","headpic":"http://test.greatchef.com.cn/Public/Nuploads/headpic/s_584f734d7ab5f.jpg","unit":"ggggg","duty":"吃货","isauth":"0","role":"1"}}]}
     */

    private String code;
    private String message;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * topic : {"id":"7","name":"#我们的","toppic":"http://m.greatchef.com.cn//Public/images/newfood.jpg","join_num":"0","ishot":"0","joinuserlist":[]}
         * list : [{"id":"20","content":"111把","uid":"64172","comment_sum":"0","addtime":"1489737040","commentnum":"0","zan":"0","ps":"0","fs":"0","piclist":[{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ab213e2.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ab213e2.jpg"},{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ad8e7c3.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ad8e7c3.jpg"},{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ac957d0.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ac957d0.jpg"}],"comments":[],"author":{"uid":"64172","nick_name":"赵赫ラーメ","headpic":"http://test.greatchef.com.cn/Public/Nuploads/headpic/s_584f734d7ab5f.jpg","unit":"ggggg","duty":"吃货","isauth":"0","role":"1"}}]
         */

        private TopicBean topic;
        private List<ListBean> list;

        public TopicBean getTopic() {
            return topic;
        }

        public void setTopic(TopicBean topic) {
            this.topic = topic;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class TopicBean {
            /**
             * id : 7
             * name : #我们的
             * toppic : http://m.greatchef.com.cn//Public/images/newfood.jpg
             * join_num : 0
             * ishot : 0
             * joinuserlist : []
             */

            private String id;
            private String name;
            private String toppic;
            private String join_num;
            private String ishot;
            private List<?> joinuserlist;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getToppic() {
                return toppic;
            }

            public void setToppic(String toppic) {
                this.toppic = toppic;
            }

            public String getJoin_num() {
                return join_num;
            }

            public void setJoin_num(String join_num) {
                this.join_num = join_num;
            }

            public String getIshot() {
                return ishot;
            }

            public void setIshot(String ishot) {
                this.ishot = ishot;
            }

            public List<?> getJoinuserlist() {
                return joinuserlist;
            }

            public void setJoinuserlist(List<?> joinuserlist) {
                this.joinuserlist = joinuserlist;
            }
        }

        public static class ListBean {
            /**
             * id : 20
             * content : 111把
             * uid : 64172
             * comment_sum : 0
             * addtime : 1489737040
             * commentnum : 0
             * zan : 0
             * ps : 0
             * fs : 0
             * piclist : [{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ab213e2.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ab213e2.jpg"},{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ad8e7c3.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ad8e7c3.jpg"},{"picurl":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ac957d0.jpg","picurl_photo":"http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ac957d0.jpg"}]
             * comments : []
             * author : {"uid":"64172","nick_name":"赵赫ラーメ","headpic":"http://test.greatchef.com.cn/Public/Nuploads/headpic/s_584f734d7ab5f.jpg","unit":"ggggg","duty":"吃货","isauth":"0","role":"1"}
             */

            private String id;
            private String content;
            private String uid;
            private String comment_sum;
            private String addtime;
            private String commentnum;
            private String zan;
            private String ps;
            private String fs;
            private AuthorBean author;
            private List<PiclistBean> piclist;
            private List<?> comments;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getComment_sum() {
                return comment_sum;
            }

            public void setComment_sum(String comment_sum) {
                this.comment_sum = comment_sum;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getCommentnum() {
                return commentnum;
            }

            public void setCommentnum(String commentnum) {
                this.commentnum = commentnum;
            }

            public String getZan() {
                return zan;
            }

            public void setZan(String zan) {
                this.zan = zan;
            }

            public String getPs() {
                return ps;
            }

            public void setPs(String ps) {
                this.ps = ps;
            }

            public String getFs() {
                return fs;
            }

            public void setFs(String fs) {
                this.fs = fs;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public List<PiclistBean> getPiclist() {
                return piclist;
            }

            public void setPiclist(List<PiclistBean> piclist) {
                this.piclist = piclist;
            }

            public List<?> getComments() {
                return comments;
            }

            public void setComments(List<?> comments) {
                this.comments = comments;
            }

            public static class AuthorBean {
                /**
                 * uid : 64172
                 * nick_name : 赵赫ラーメ
                 * headpic : http://test.greatchef.com.cn/Public/Nuploads/headpic/s_584f734d7ab5f.jpg
                 * unit : ggggg
                 * duty : 吃货
                 * isauth : 0
                 * role : 1
                 */

                private String uid;
                private String nick_name;
                private String headpic;
                private String unit;
                private String duty;
                private String isauth;
                private String role;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getNick_name() {
                    return nick_name;
                }

                public void setNick_name(String nick_name) {
                    this.nick_name = nick_name;
                }

                public String getHeadpic() {
                    return headpic;
                }

                public void setHeadpic(String headpic) {
                    this.headpic = headpic;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getDuty() {
                    return duty;
                }

                public void setDuty(String duty) {
                    this.duty = duty;
                }

                public String getIsauth() {
                    return isauth;
                }

                public void setIsauth(String isauth) {
                    this.isauth = isauth;
                }

                public String getRole() {
                    return role;
                }

                public void setRole(String role) {
                    this.role = role;
                }
            }

            public static class PiclistBean {
                /**
                 * picurl : http://test.greatchef.com.cn/Public/Nuploads/dynamic/600_58cb98ab213e2.jpg
                 * picurl_photo : http://test.greatchef.com.cn/Public/Nuploads/dynamic/1280_58cb98ab213e2.jpg
                 */

                private String picurl;
                private String picurl_photo;

                public String getPicurl() {
                    return picurl;
                }

                public void setPicurl(String picurl) {
                    this.picurl = picurl;
                }

                public String getPicurl_photo() {
                    return picurl_photo;
                }

                public void setPicurl_photo(String picurl_photo) {
                    this.picurl_photo = picurl_photo;
                }
            }
        }
    }
}
