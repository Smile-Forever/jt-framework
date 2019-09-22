package io.github.hylexus.jt808.support.entity.scan;

import io.github.hylexus.jt808.msg.RequestMsgHeader;

/**
 * 目前仅仅适用于 {@link io.github.hylexus.jt.annotation.Jt808MsgBody} 修饰的类
 *
 * @author hylexus
 * Created At 2019-09-22 9:42 下午
 */
public interface RequestMsgHeaderAware {

    void setRequestMsgHeader(RequestMsgHeader header);

}
