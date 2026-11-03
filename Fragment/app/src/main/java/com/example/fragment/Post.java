package com.example.fragment;

public class Post {
    private String authorName;
    private String authorInitials;
    private int avatarBgColor;
    private String timeAgo;
    private String content;
    private boolean isLiked;
    private int likesCount;
    private int commentsCount;
    private int sharesCount;

    public Post(String authorName, String authorInitials, int avatarBgColor,
                String timeAgo, String content, boolean isLiked,
                int likesCount, int commentsCount, int sharesCount) {
        this.authorName = authorName;
        this.authorInitials = authorInitials;
        this.avatarBgColor = avatarBgColor;
        this.timeAgo = timeAgo;
        this.content = content;
        this.isLiked = isLiked;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.sharesCount = sharesCount;
    }

    // getters
    public String getAuthorName() { return authorName; }
    public String getAuthorInitials() { return authorInitials; }
    public int getAvatarBgColor() { return avatarBgColor; }
    public String getTimeAgo() { return timeAgo; }
    public String getContent() { return content; }
    public boolean isLiked() { return isLiked; }
    public int getLikesCount() { return likesCount; }
    public int getCommentsCount() { return commentsCount; }
    public int getSharesCount() { return sharesCount; }
}