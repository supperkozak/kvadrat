package kvadrat.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kvadrat.dao.DataDao;
import kvadrat.model.Data;
import kvadrat.service.DataService;

@Service("dataService")
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataDao dao;

	public List<Data> getAllData() {
		return dao.getAllData();
	}

	public void insertData(int a, int b, int c, int x1, int x2) {
		Data newData = new Data(a, b, c, x1, x2);
		dao.insertData(newData);
		
	}

}
