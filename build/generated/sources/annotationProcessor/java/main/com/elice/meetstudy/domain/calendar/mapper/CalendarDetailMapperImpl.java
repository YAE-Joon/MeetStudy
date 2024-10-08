package com.elice.meetstudy.domain.calendar.mapper;

import com.elice.meetstudy.domain.calendar.domain.Calendar_detail;
import com.elice.meetstudy.domain.calendar.dto.RequestCalendarDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-24T16:35:09+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.1.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CalendarDetailMapperImpl implements CalendarDetailMapper {

    @Override
    public Calendar_detail toCalendarDetail(RequestCalendarDetail requestCalendarDetail) {
        if ( requestCalendarDetail == null ) {
            return null;
        }

        Calendar_detail.Calendar_detailBuilder calendar_detail = Calendar_detail.builder();

        calendar_detail.title( requestCalendarDetail.title() );
        calendar_detail.content( requestCalendarDetail.content() );
        calendar_detail.startDay( requestCalendarDetail.startDay() );
        calendar_detail.endDay( requestCalendarDetail.endDay() );
        calendar_detail.startTime( requestCalendarDetail.startTime() );
        calendar_detail.endTime( requestCalendarDetail.endTime() );

        return calendar_detail.build();
    }
}
