package com.tuandev.zen_zii.mapper;
import com.tuandev.zen_zii.model.Comment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommentMapper {
    
    @Insert("INSERT INTO comments(post_id, commenter_id, comment_content, comment_timestamp, commenter_name, commenter_avatar) " +
            "values(#{postId}, #{commenterId}, #{commentContent}, #{commentTimestamp}, #{commenterName}, #{commenterAvatar})")
    int insertComment(Integer postId, Integer commenterId, String commentContent, String commentTimestamp,String commenterName, String commenterAvatar);

    @Select("SELECT * FROM comments WHERE post_id = #{postId}")
    List<Comment> fetchCommentsByPostId(Integer postId);

}