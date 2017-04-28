//package cz.uhk.sportportal.service.impl;
//
//import java.util.List;
//
//import cz.uhk.sportportal.dao.CategoryDao;
//import cz.uhk.sportportal.model.Category;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import cz.uhk.sportportal.service.CategoryService;
//
//@Service
//@Transactional
//public class CategoryServiceImpl implements CategoryService {
//
//	@Autowired
//	private CategoryDao categoryDao;
//
//	@Override
//	public List<Category> findAll() {
//		return categoryDao.findAll();
//	}
//
//	@Override
//	public void save(Category category) {
//		categoryDao.save(category);
//	}
//
//	@Override
//	public Category update(Category category) {
//		return categoryDao.update(category);
//	}
//
//	@Override
//	public void disable(Category category) {
//		categoryDao.disable(category);
//	}
//
//	@Override
//	public Category findById(Integer id) {
//		return categoryDao.findById(id);
//	}
//
//	@Override
//	public int getCount() {
//		return categoryDao.getCount();
//	}
//
//	@Override
//	public List<Category> findEnabledAll() {
//		return categoryDao.findEnabledAll();
//	}
//
//}
