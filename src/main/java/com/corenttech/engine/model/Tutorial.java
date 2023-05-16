package com.corenttech.engine.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Tutorial {
    @Id
    private Integer id;
    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private Boolean published;
}
