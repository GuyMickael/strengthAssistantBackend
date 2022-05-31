package com.example.strengthAssistantBackend.user.model;

import com.example.strengthAssistantBackend.bloc.model.LiftingBlocs;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = User.COLLECTION)
public class User {
    public static final String COLLECTION = "user";

    @Id
    private String id;
    private String FirstName;
    private String LastName;
    private String Password;
    private Integer Age;
    private Integer Size;
    private Integer Weight;
    private String Role;
    private String CoachId;
    private List<LiftingBlocs> Blocs;
    private List<String> CoachedAthletes;
}

