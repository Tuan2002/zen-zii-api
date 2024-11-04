package com.tuandev.zen_zii.service;

import com.tuandev.zen_zii.dto.PostDto;
import com.tuandev.zen_zii.dto.UpdatePostDto;
import com.tuandev.zen_zii.mapper.PostMapper;
import com.tuandev.zen_zii.mapper.UserMapper;
import com.tuandev.zen_zii.model.DetailedPost;
import com.tuandev.zen_zii.model.Post;
import com.tuandev.zen_zii.model.User;
import com.tuandev.zen_zii.service.interfaces.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Primary

public class PostsService implements IPostsService {
    @Autowired
    private PostMapper _postMapper;
    @Autowired
    private UserMapper _userMapper;
    @Override
    public int insertPost(PostDto postDto) {
        try {
            return _postMapper.insertPost(postDto.postIdentifier, postDto.imageUrl, postDto.userId, postDto.postDate,
                    postDto.postLocation, postDto.postCaption, postDto.postAlt, postDto.postComments, postDto.postLikes,  postDto.allowComment, postDto.allowLike);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public List<Post> getPostsById(Integer id) {
        try {
            return _postMapper.getPostsById(id);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Post> getPostsByName(String userName) {
        try {
            return _postMapper.getPostsByName(userName);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Post> getPostByIdentifier(String identifier) {
        try {
            return _postMapper.getPostByIdentifier(identifier);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public DetailedPost getPostByPostId(Integer postId) {
        try {
            DetailedPost detailedPost = _postMapper.getPostByPostId(postId);
            Integer userId = detailedPost.getUserId();
            User user = _userMapper.getUserById(userId);
            String userAvatar = user.getAvatar();
            String userName = user.getUserName();
            detailedPost.setUserAvatar(userAvatar);
            detailedPost.setUserName(userName);
            return detailedPost;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<DetailedPost> getRandomPosts(Integer limit) {
        try {
            return _postMapper.getRandomPosts(limit);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<DetailedPost> getSamplePostsExcludingSelf(Integer userId, Integer limit) {
        try {
            return _postMapper.getSamplePostsExcludingSelf(userId, limit);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<DetailedPost> getFriendPostsPaging(Integer userId, Integer startIndex, Integer limit) {
      try {
          return _postMapper.getFriendPostsPaging(userId, startIndex, limit);
      }
      catch (Exception e) {
          System.out.println(e.getMessage());
          return null;
      }
    }

    @Override
    public List<DetailedPost> getFavoritePostsPaging(Integer userId, Integer startIndex, Integer limit) {
      try {
          return _postMapper.getFavoritePostsPaging(userId, startIndex, limit);
      }
      catch (Exception e) {
          System.out.println(e.getMessage());
          return null;
      }
    }

    @Override
    public List<Post> getSavedPostsByUserId(Integer userId) {
        try {
            return _postMapper.getSavedPostsByUserId(userId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Integer deletePost(Integer postId) {
        try {
            return _postMapper.deletePost(postId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int updatePost(UpdatePostDto post) {
        try {
            return _postMapper.updatePost(post.postId, post.postCaption, post.postLocation, post.postAlt);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int increaseComments(Integer postId) {
        try {
            return _postMapper.increaseComments(postId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int decreaseComments(Integer postId) {
        try {
            return _postMapper.decreaseComments(postId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int increaseLikes(Integer postId) {
        try {
            return _postMapper.increaseLikes(postId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int decreaseLikes(Integer postId) {
        try {
            return _postMapper.decreaseLikes(postId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
