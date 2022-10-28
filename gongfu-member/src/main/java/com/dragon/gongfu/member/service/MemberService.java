package com.dragon.gongfu.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 15:06:48
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

