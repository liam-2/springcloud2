package dao;

import org.apache.ibatis.annotations.Mapper;
import domain.Hero;

@Mapper
public interface HeroMapper {

	int insert(Hero record);

	int update(Hero record);

	int delete(Integer id);

}