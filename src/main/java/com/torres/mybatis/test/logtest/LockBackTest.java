package com.torres.mybatis.test.logtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Created by Torres on 2018-05-25 10:20.
 */
@Slf4j
public class LockBackTest {

    @Test
    public void test() {
        int[] array = new int[]{1, 2, 3};
        for (int i : array) {
            log.info("数组中的元素为:{}", i);
        }
    }


}
