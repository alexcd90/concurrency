package com.icinfo.example.atomic;

import com.icinfo.annotations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月18
 */
@Slf4j
@ThreadSafe
public class CountExample5 {
    private static AtomicIntegerFieldUpdater<CountExample5> updater =
            AtomicIntegerFieldUpdater.newUpdater(CountExample5.class, "count");
    @Getter
    private volatile int count = 100;

    public static void main(String[] args) {
        CountExample5 countExample5 = new CountExample5();

        if (updater.compareAndSet(countExample5, 100, 120)) {
            log.info("update success 1,{}", countExample5.getCount());
        }

        if (updater.compareAndSet(countExample5,100,150)){
            log.info("update success 2,{}",countExample5.getCount());
        }else {
            log.info("update failed ,{}",countExample5.getCount());
        }
    }
}
