package org.teamone.projecttemplate.command.vo;

public class RequirementSequenceRequest {
    private int projectId;
    private int requirementNo;
    private int num;

    public RequirementSequenceRequest() {
    }

    public RequirementSequenceRequest(int projectId, int requirementNo, int num) {
        this.projectId = projectId;
        this.requirementNo = requirementNo;
        this.num = num;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getRequirementNo() {
        return requirementNo;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "RequirementSequenceRequest{" +
                "projectId=" + projectId +
                ", requirementNo=" + requirementNo +
                ", num=" + num +
                '}';
    }
}
