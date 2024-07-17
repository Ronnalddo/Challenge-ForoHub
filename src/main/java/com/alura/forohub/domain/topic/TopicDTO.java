package com.alura.forohub.domain.topic;

import java.util.List;

import com.alura.forohub.domain.comment.CommentDTO;
import com.alura.forohub.domain.course.CourseDTO;
import com.alura.forohub.domain.user.UserDTO;

public record TopicDTO(Integer id, String subject, String content, UserDTO user, CourseDTO course, List<CommentDTO> comments) {
    public TopicDTO(Topic topic) {
        this(topic.getId(), topic.getSubject(), topic.getContent(), new UserDTO(topic.getUser()),
                new CourseDTO(topic.getCourse()), topic.getComments().stream().map(CommentDTO::new).toList());
    }
}
