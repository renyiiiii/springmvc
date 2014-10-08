package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.TransactionManager;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import entity.Test;
import entity.TestDAO;
public class SampleMultiActionController extends MultiActionController{
	private String addViewName;
	private String insertViewName;
	private String updateViewName;
	private TestDAO testDao;
	

	public TestDAO getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDAO testDao) {
		this.testDao = testDao;
	}

	public String getInsertViewName() {
		return insertViewName;
	}

	public void setInsertViewName(String insertViewName) {
		this.insertViewName = insertViewName;
	}

	public String getUpdateViewName() {
		return updateViewName;
	}

	public void setUpdateViewName(String updateViewName) {
		this.updateViewName = updateViewName;
	}

	public String getAddViewName() {
		return addViewName;
	}

	public void setAddViewName(String addViewName) {
		this.addViewName = addViewName;
	}

	public ModelAndView add(HttpServletRequest req,
            HttpServletResponse res) throws ServletRequestBindingException, IOException {
		System.out.println("add");
		Test entity=new Test(req.getParameter("name"), req.getParameter("age"));
		
		getTestDao().save(entity);
		List<Test> list=getTestDao().findAll(null);
		System.out.println(list.size());
		req.setAttribute("testlist", list);
		return new ModelAndView(getAddViewName());
	}
	
	public ModelAndView insert(HttpServletRequest req,
            HttpServletResponse res) throws ServletRequestBindingException, IOException {
		System.out.println("insert");
		return new ModelAndView(getInsertViewName());
	}
	public ModelAndView delete(HttpServletRequest req,
			HttpServletResponse res) throws ServletRequestBindingException, IOException {
		System.out.println("delete");
		Test entity=new Test(req.getParameter("name"), req.getParameter("age"));
		entity.setId(Long.valueOf(req.getParameter("id")));
		getTestDao().delete(entity);
		List<Test> list=getTestDao().findAll(null);
		System.out.println(list.size());
		req.setAttribute("testlist", list);
		return new ModelAndView(getAddViewName());
	}
	
	public ModelAndView update(HttpServletRequest req,
            HttpServletResponse res) throws ServletRequestBindingException, IOException {
		System.out.println("update");
		Test entity=new Test(req.getParameter("name"), req.getParameter("age"));
		entity.setId(Long.valueOf(req.getParameter("id")));
		getTestDao().update(entity);
		List<Test> list=getTestDao().findAll(null);
		System.out.println(list.size());
		req.setAttribute("testlist", list);
		return new ModelAndView(getAddViewName());
	}
	
	public ModelAndView findall(HttpServletRequest req,
            HttpServletResponse res) throws ServletRequestBindingException, IOException {
		
		List<Test> list=getTestDao().findAll(null);
		System.out.println(list.size());
		req.setAttribute("testlist", list);
		return new ModelAndView(getAddViewName());
	}

}
