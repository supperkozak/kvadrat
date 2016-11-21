package kvadrat.dao;

import java.util.List;

import kvadrat.model.Data;

public interface DataDao {
	
	void insertData(Data data);
	
	List<Data> getAllData();

}
