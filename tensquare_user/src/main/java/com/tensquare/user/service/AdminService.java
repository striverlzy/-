package com.tensquare.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import util.IdWorker;

import com.tensquare.user.dao.AdminDao;
import com.tensquare.user.pojo.Admin;

/**
 * 服务层
 *
 * @author Administrator
 */
@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private IdWorker idWorker;


    @Autowired
    private BCryptPasswordEncoder encoder;


    /**
     * 根据登陆名和密码查询
     *
     * @param loginname
     * @param password
     * @return
     */
//    public Admin findByLoginnameAndPassword(String loginname, String password) {
//        // 先根据用户名查询对象
//        Admin admin = adminDao.findByLoginname(loginname);
//        // 然后拿数据库中的密码和用户输入的密码匹配是否相同
//        if (admin != null && encoder.matches(password, admin.getPassword())) {
//            // 保证数据库中的对象中的密码和用户输入的密码是一致的。登录成功
//            return admin;
//        } else {
//            // 登录失败
//            return null;
//        }
//    }

    /**
     * 查询全部列表
     *
     * @return
     */
    public List<Admin> findAll() {
        return adminDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
//    public Page<Admin> findSearch(Map whereMap, int page, int size) {
//        Specification<Admin> specification = createSpecification(whereMap);
//        PageRequest pageRequest = PageRequest.of(page - 1, size);
//        return adminDao.findAll(specification, pageRequest);
//    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
//    public List<Admin> findSearch(Map whereMap) {
//        Specification<Admin> specification = createSpecification(whereMap);
//        return adminDao.findAll(specification);
//    }

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    public Admin findById(String id) {
        return adminDao.findById(id).get();
    }

    /**
     * 增加
     *
     * @param admin
     */
//    public void add(Admin admin) {
//        admin.setId(idWorker.nextId() + ""); //主键值
//        //密码加密
//        String newpassword = encoder.encode(admin.getPassword());//加密后的密码
//        admin.setPassword(newpassword);
//        adminDao.save(admin);
//    }

    /**
     * 修改
     *
     * @param admin
     */
    public void update(Admin admin) {
        adminDao.save(admin);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(String id) {
        adminDao.deleteById(id);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
//    private Specification<Admin> createSpecification(Map searchMap) {
//
//        return new Specification<Admin>() {
//
//            @Override
//            public Predicate toPredicate(Root<Admin> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                List<Predicate> predicateList = new ArrayList<Predicate>();
//                // ID
//                if (searchMap.get("id") != null && !"".equals(searchMap.get("id"))) {
//                    predicateList.add(cb.like(root.get("id").as(String.class), "%" + (String) searchMap.get("id") + "%"));
//                }
//                // 登陆名称
//                if (searchMap.get("loginname") != null && !"".equals(searchMap.get("loginname"))) {
//                    predicateList.add(cb.like(root.get("loginname").as(String.class), "%" + (String) searchMap.get("loginname") + "%"));
//                }
//                // 密码
//                if (searchMap.get("password") != null && !"".equals(searchMap.get("password"))) {
//                    predicateList.add(cb.like(root.get("password").as(String.class), "%" + (String) searchMap.get("password") + "%"));
//                }
//                // 状态
//                if (searchMap.get("state") != null && !"".equals(searchMap.get("state"))) {
//                    predicateList.add(cb.like(root.get("state").as(String.class), "%" + (String) searchMap.get("state") + "%"));
//                }
//
//                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));
//
//            }
//        };
//
//    }

}
