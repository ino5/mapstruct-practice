package org.example.mapper;

import org.example.dto.UserDto;
import org.example.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserMapperTest {
    @DisplayName("User → UserDto 매핑 테스트")
    @Test
    void userToUserDto_shouldMapCorrectly() {
        // given
        User user = new User();
        user.setId(1L);
        user.setName("Inho");

        // when
        UserDto dto = UserMapper.INSTANCE.userToUserDto(user);

        // then
        assertEquals(user.getId(), dto.getId());
        assertEquals(user.getName(), dto.getName());


    }
}
