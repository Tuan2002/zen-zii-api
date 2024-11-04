package com.tuandev.zen_zii.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PostDto {
    public String postIdentifier;
    public String imageUrl;
    public int userId;
    public String postDate;
    public String postLocation;
    public String postCaption;
    public String postAlt;
    public int postComments;
    public int postLikes;
    public boolean allowComment;
    public boolean allowLike;
}
