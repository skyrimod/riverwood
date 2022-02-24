package com.skyrimod.riverwood.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
public class TestJsonRequest implements Serializable {
    private String inspectName;
    private String inspectCnName;
    private String inspectContent;
    private String ownerTeam;
}
