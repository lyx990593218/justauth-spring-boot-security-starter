/*
 * MIT License
 * Copyright (c) 2020-2029 YongWu zheng (dcenter.top and gitee.com/pcore and github.com/ZeroOrInfinity)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package top.dcenter.ums.security.core.oauth.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * OAuth2 URL 基本属性
 * @author Douglas Lai
 * @version V1.0  Created by 2021/10/13 14:08
 */
@SuppressWarnings("jol")
@Getter
@Setter
public class BaseAuth2UrlProperties {

    /**
     * 授权url
     *
     */
    private String authorizeUrl;
    /**
     * 获取token url
     */
    private String accessTokenUrl;
    /**
     * 获取userinfo url
     */
    private String userInfoUrl;

    /**
     * 使用 钉钉 登录时，根据unionid获取userid。
     *
     * @since 1.15.5
     */
    private String dingtalkUserIdUrl;

    /**
     * 使用 钉钉 登录时，根据access_token 和 userid 获取 用户信息。
     *
     * @since 1.15.5
     */
    private String dingtalkUserInfoUrl;
}
