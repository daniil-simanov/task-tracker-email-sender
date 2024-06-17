package com.dansim.tasktrackeremailsender.dto;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class EmailDTO  {

    private String recipientAddress;
    private String title;
    private String text;


}
