package com.ppt.gmall.ums.service.impl;

import com.ppt.gmall.ums.entity.Member;
import com.ppt.gmall.ums.mapper.MemberMapper;
import com.ppt.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-28
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
