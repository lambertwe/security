package com.codingapi.security.core.db.dao;

import com.codingapi.security.core.db.entity.SRoleResource;
import com.lorne.mysql.framework.dao.BaseDao;

import java.util.List;

/**
 * Created by houcunlu on 2017/8/22.
 */
public interface SRoleResourceDao extends BaseDao<SRoleResource> {


    List<SRoleResource> getResourceByRoleId(String rId);



    boolean delRoleResourceById(Integer id);
}
