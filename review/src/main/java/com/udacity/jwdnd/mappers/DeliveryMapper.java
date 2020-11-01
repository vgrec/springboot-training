package com.udacity.jwdnd.mappers;

import com.udacity.jwdnd.data.Delivery;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DeliveryMapper {

    @Select("SELECT * FROM delivery WHERE id=#{id}")
    Delivery findDelivery(int id);

    @Insert("INSERT into delivery (orderId, time) VALUES(#{orderId}, #{time})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Delivery delivery);

    @Delete("DELETE FROM delivery WHERE id = #{id}")
    void delete(int id);
}
