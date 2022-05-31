package com.example.strengthAssistantBackend.bloc.model;

import com.example.strengthAssistantBackend.user.model.Training;

import java.util.Date;
import java.util.List;

public class LiftingBlocs {
    String id;
    String CoachId;
    String AthleteId;
    Integer BlocNumber;
    Date StartDate;
    Date EndDate;
    List<Training> Trainings;
}
