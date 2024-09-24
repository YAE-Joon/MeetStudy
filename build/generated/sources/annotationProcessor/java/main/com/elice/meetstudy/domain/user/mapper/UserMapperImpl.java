package com.elice.meetstudy.domain.user.mapper;

import com.elice.meetstudy.domain.user.domain.User;
import com.elice.meetstudy.domain.user.dto.UserLoginDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-24T16:35:09+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.1.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserLoginDto toUserLoginDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserLoginDto userLoginDto = new UserLoginDto();

        userLoginDto.setEmail( user.getEmail() );
        userLoginDto.setPassword( user.getPassword() );

        return userLoginDto;
    }

    @Override
    public User toUser(UserLoginDto userLoginDto) {
        if ( userLoginDto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( userLoginDto.getEmail() );
        user.password( userLoginDto.getPassword() );

        return user.build();
    }
}
