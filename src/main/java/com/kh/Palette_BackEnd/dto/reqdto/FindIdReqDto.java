package com.kh.Palette_BackEnd.dto.reqdto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindIdReqDto {
    private String name;
    private String registrationNumber;
}
