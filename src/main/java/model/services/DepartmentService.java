package model.services;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import com.miguel.workshopjavafx.Department;

import java.util.List;

public class DepartmentService {
    private DepartmentDao dao = DaoFactory.createDepartmentDao();
    public List<Department> findAll() {
        return dao.findAll();
    }
}
