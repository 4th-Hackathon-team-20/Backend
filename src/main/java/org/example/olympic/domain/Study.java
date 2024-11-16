package org.example.olympic.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.olympic.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Study extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false, length = 60)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
<<<<<<< Updated upstream
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
=======
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    private String studyImageUrl;
>>>>>>> Stashed changes

    @OneToMany(mappedBy = "study", cascade = CascadeType.ALL)
    private List<Likes> likesList = new ArrayList<>();

    @OneToMany(mappedBy = "study", cascade = CascadeType.ALL)
    private List<Comment> commentList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "study_hashtags", joinColumns = @JoinColumn(name = "study_id"))
    @Column(name = "hashtag")
    private List<String> hashtags;
<<<<<<< Updated upstream
=======

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")  // 외래키 컬럼 이름 설정
    private Subject subject;
>>>>>>> Stashed changes
}
