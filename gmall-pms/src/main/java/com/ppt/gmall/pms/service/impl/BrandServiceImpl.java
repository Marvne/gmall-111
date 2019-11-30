package com.ppt.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ppt.gmall.pms.entity.Brand;
import com.ppt.gmall.pms.mapper.BrandMapper;
import com.ppt.gmall.pms.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-28
 */
@com.alibaba.dubbo.config.annotation.Service
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
