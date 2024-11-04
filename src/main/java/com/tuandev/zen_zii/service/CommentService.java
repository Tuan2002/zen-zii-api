package com.tuandev.zen_zii.service;
import com.tuandev.zen_zii.dto.CommentDto;
import com.tuandev.zen_zii.mapper.CommentMapper;
import com.tuandev.zen_zii.model.Comment;
import com.tuandev.zen_zii.service.interfaces.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Primary
public class CommentService implements ICommentService {
    @Autowired
    private CommentMapper _commentMapper;

    @Override
    public int insertComment(CommentDto commentDto) {
        try {
            return _commentMapper.insertComment(commentDto.postId, commentDto.commenterId, commentDto.commentContent, commentDto.commentTimestamp, commentDto.commenterName, commentDto.commenterAvatar);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public List<Comment> fetchCommentsByPostId(Integer postId) {
        try {
        return _commentMapper.fetchCommentsByPostId(postId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
