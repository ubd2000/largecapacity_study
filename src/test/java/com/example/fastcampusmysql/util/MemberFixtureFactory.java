package com.example.fastcampusmysql.util;

import com.example.fastcampusmysql.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

/**
 * @author love_
 */
public class MemberFixtureFactory {
    static public Member create() {
        var param = new EasyRandomParameters().seed(1L);
        return new EasyRandom(param).nextObject(Member.class);
    }
    static public Member create(Long seed) {
        var param = new EasyRandomParameters().seed(seed);
        return new EasyRandom(param).nextObject(Member.class);
    }
}
