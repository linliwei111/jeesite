/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.stu.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.stu.entity.Student;

/**
 * stuDAO接口
 * @author stu
 * @version 2019-09-10
 */
@MyBatisDao
public interface StudentDao extends CrudDao<Student> {
	
}