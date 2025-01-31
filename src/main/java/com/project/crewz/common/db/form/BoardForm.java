package com.project.crewz.common.db.form;

import lombok.Getter;

@Getter
public class BoardForm {
    private Long moimno;
    private String memberId;
    private String title;
    private String content;

    @Override
    public String toString() {
        return "BoardForm{" +
                "moimno=" + moimno +
                ", memberId='" + memberId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
