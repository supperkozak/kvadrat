package kvadrat.service;

import java.util.List;

import kvadrat.model.Data;

public interface DataService {
	void insertData(int a, int b, int c, int x1, int x2);

	List<Data> getAllData();
	

}
