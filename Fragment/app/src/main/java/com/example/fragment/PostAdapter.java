package com.example.fragment;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private final List<Post> posts;

    public PostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.tvAuthor.setText(post.getAuthorName());
        holder.tvInitials.setText(post.getAuthorInitials());
        holder.tvTime.setText(post.getTimeAgo());
        holder.tvContent.setText(post.getContent());

        if (holder.tvInitials.getBackground() instanceof GradientDrawable) {
            GradientDrawable background = (GradientDrawable) holder.tvInitials.getBackground();
            background.setColor(post.getAvatarBgColor());
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    // Changed class visibility to public static
    public static class PostViewHolder extends RecyclerView.ViewHolder {
        public TextView tvAuthor, tvInitials, tvTime, tvContent;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAuthor = itemView.findViewById(R.id.tvAuthorName);
            tvInitials = itemView.findViewById(R.id.tvAvatarInitials);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvContent = itemView.findViewById(R.id.tvContent);
        }
    }
}