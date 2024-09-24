package com.elice.meetstudy.domain.qna.mapper;

import com.elice.meetstudy.domain.qna.domain.Answer;
import com.elice.meetstudy.domain.qna.dto.RequestAnswerDto;
import com.elice.meetstudy.domain.qna.dto.ResponseAnswerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-24T16:35:09+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.1.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class AnswerMapperImpl implements AnswerMapper {

    @Override
    public Answer toAnswerEntity(RequestAnswerDto requestAnswerDto) {
        if ( requestAnswerDto == null ) {
            return null;
        }

        Answer.AnswerBuilder answer = Answer.builder();

        answer.content( requestAnswerDto.content() );

        return answer.build();
    }

    @Override
    public ResponseAnswerDto toResponseAnswerDto(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        long id = 0L;
        String content = null;
        String createdBy = null;

        if ( answer.getId() != null ) {
            id = answer.getId();
        }
        content = answer.getContent();
        createdBy = answer.getCreatedBy();

        ResponseAnswerDto responseAnswerDto = new ResponseAnswerDto( id, content, createdBy );

        return responseAnswerDto;
    }
}
