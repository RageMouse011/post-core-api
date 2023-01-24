package com.example.postcoreapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="posts")
public class Post {
    @Id
    @Column(name="post_id")
    @NotNull
    private String postId;
    @Column(name="client_id")
    @NotNull
    private String clientId;
    @Column(name="post_recipient_id")
    @NotNull
    private String postRecipientId;
    @Column(name="post_item")
    private String postItem;
    @Column(name="status")
    private String status;
}
