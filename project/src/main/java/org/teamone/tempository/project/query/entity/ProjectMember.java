package org.teamone.tempository.project.query.entity;


import jakarta.persistence.Column;
import lombok.Data;
import org.teamone.tempository.project.query.type.ProjectMemberStatus;
import org.teamone.tempository.project.query.type.ProjectPosition;
@Data
public class ProjectMember {

    private int memberId;

    private int projectId;

    private ProjectPosition position;

    private ProjectMemberStatus memberStatus;
}
