package com.fspa.login.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class LoginRegRequestDTO  {
    private String userName;
    private String phoneNumber;
    private Boolean termAgreement;
}
