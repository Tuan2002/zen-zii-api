package com.tuandev.zen_zii.service.interfaces;

import com.tuandev.zen_zii.dto.CommentDto;
import com.tuandev.zen_zii.model.Comment;

import java.util.List;

public interface ICommentService {
    int insertComment(CommentDto comment);
    List<Comment> fetchCommentsByPostId(Integer postId);
}
