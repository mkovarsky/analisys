package ru.netology.domain;

public class PostInfo {
    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public AddLike getAddLike() {
        return addLike;
    }

    public void setAddLike(AddLike addLike) {
        this.addLike = addLike;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public AddComment getAddComment() {
        return addComment;
    }

    public void setAddComment(AddComment addComment) {
        this.addComment = addComment;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public SharePost getSharePost() {
        return sharePost;
    }

    public void setSharePost(SharePost sharePost) {
        this.sharePost = sharePost;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    private int likeCount;
    private AddLike addLike;
    private int commentCount;
    private AddComment addComment;
    private int shareCount;
    private SharePost sharePost;
    private int viewCount;
}

