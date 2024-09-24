package com.elice.meetstudy.domain.qna.mapper;

import com.elice.meetstudy.domain.qna.domain.AnswerStatus;
import com.elice.meetstudy.domain.qna.domain.Question;
import com.elice.meetstudy.domain.qna.domain.QuestionCategory;
import com.elice.meetstudy.domain.qna.dto.RequestQuestionDto;
import com.elice.meetstudy.domain.qna.dto.ResponseQuestionDto;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-24T16:35:09+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.1.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public ResponseQuestionDto toResponseQuestionDto(Question question) {
        if ( question == null ) {
            return null;
        }

        boolean isSecret = false;
        long id = 0L;
        String title = null;
        String content = null;
        String createdBy = null;
        String createdAt = null;
        AnswerStatus answerStatus = null;
        QuestionCategory questionCategory = null;

        isSecret = question.isSecret();
        id = question.getId();
        title = question.getTitle();
        content = question.getContent();
        createdBy = question.getCreatedBy();
        if ( question.getCreatedAt() != null ) {
            createdAt = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( question.getCreatedAt() );
        }
        answerStatus = question.getAnswerStatus();
        questionCategory = question.getQuestionCategory();

        String updatedAt = null;

        ResponseQuestionDto responseQuestionDto = new ResponseQuestionDto( id, title, content, createdBy, createdAt, updatedAt, answerStatus, questionCategory, isSecret );

        return responseQuestionDto;
    }

    @Override
    public Question toQuestionEntity(RequestQuestionDto requestQuestionDto) {
        if ( requestQuestionDto == null ) {
            return null;
        }

        Question.QuestionBuilder question = Question.builder();

        question.title( requestQuestionDto.title() );
        question.content( requestQuestionDto.content() );
        question.questionCategory( requestQuestionDto.questionCategory() );
        question.isSecret( requestQuestionDto.isSecret() );
        question.password( requestQuestionDto.password() );

        return question.build();
    }
}
