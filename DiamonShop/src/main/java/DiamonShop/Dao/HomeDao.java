package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entiy.MapperSlides;
import DiamonShop.Entiy.Slides;

@Repository
public class HomeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Slides> getDataSlides() {
		List<Slides> slides = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		slides = jdbcTemplate.query(sql, new MapperSlides());
		return slides;
	}
	
}
