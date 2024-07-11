package dev.be.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.be.modulecommon.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class CommonResponse<T> {

    private String returnCode;
    private String returnMessage;
    private T info;

    public CommonResponse(CodeEnum codeEnum){
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }

    public CommonResponse(T info){
        setReturnMessage(CodeEnum.SUCCESS.getCode());
        setReturnMessage(CodeEnum.SUCCESS.getMessage());
        setInfo(info);
    }

    public CommonResponse(CodeEnum codeEnum, T info){
        setReturnMessage(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
        setInfo(info);
    }

}
