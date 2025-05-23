package org.lucky0111.pettalkmcpserver.domain.entity.community;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lucky0111.pettalkmcpserver.domain.common.BaseTimeEntity;
import org.lucky0111.pettalkmcpserver.domain.common.PetCategory;
import org.lucky0111.pettalkmcpserver.domain.common.PostCategory;
import org.lucky0111.pettalkmcpserver.domain.entity.user.PetUser;

@Setter
@Getter
@Entity
@Table(name = "posts")
@NoArgsConstructor
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PostCategory postCategory;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PetCategory petCategory;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private PetUser user;

    private String title;
    private String content;
    private String imageUrl;
    private String videoUrl;
}
