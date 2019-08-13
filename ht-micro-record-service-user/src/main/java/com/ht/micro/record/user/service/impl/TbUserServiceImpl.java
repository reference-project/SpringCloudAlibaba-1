package com.ht.micro.record.user.service.impl;

import com.ht.micro.record.commons.domain.TbUser;
import com.ht.micro.record.commons.mapper.baseMapper.TbUserMapper;
import com.ht.micro.record.commons.service.impl.BaseCrudServiceImpl;
import com.ht.micro.record.user.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Cacheable
 * 将方法运行结果进行缓存，当方法被再次调用时，直接返回缓存中的结果。
 *
 * 参数：
 * value：指定缓存组件的名字
 * key：缓存的key。可以使用SpEl表达式
 * condition：缓存条件。（为true时缓存），使用EL表达式
 * unless：否定缓存。（为true时不缓存）unless在方法执行之后判断，所以unless可以用结	果作为判断条件。
 *
 * @CachePut
 *
 * 修改了数据库的数据，同时更新缓存。
 *
 * 先调用目标方法，然后缓存方法结果。
 *
 * 为保持同步，key需要设置和@Cacheable相同。
 *
 * @CacheEvict 清除缓存
 *
 * @CacheConfig 抽取公共配置
 */
@Service
@CacheConfig(cacheNames = "user")
public class TbUserServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Cacheable(key = "#id"/*,condition = "#id>1",unless = "#result.id<0"*/)
    public TbUser getById(long id) {
        return tbUserMapper.selectByPrimaryKey(id);
    }


    @CachePut(key = "#result.id")
    public TbUser updateUser(TbUser userInfo) {
        System.out.println("update" + userInfo);
        tbUserMapper.updateByPrimaryKeySelective(userInfo);
        return userInfo;
    }

    @CacheEvict(key = "#id")
    public void deleteUser(long id) {
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);
        tbUserMapper.delete(tbUser);
    }

}