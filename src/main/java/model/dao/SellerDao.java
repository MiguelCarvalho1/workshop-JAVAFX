package model.dao;

import java.util.List;


import com.miguel.workshopjavafx.Department;
import com.miguel.workshopjavafx.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
