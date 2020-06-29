package com.qingchen.study.vlife;

/**
 * 错误信息
 * @author xuliang
 *
 */
public enum ErrorCode {
	/**
	 * Session 失效
	 */
	expires(ErrorType.session_expires, HttpStatus.error_session_expire),
	
	/**
	 * 不支持的协议
	 */
	not_support_protocol(ErrorType.server_error, HttpStatus.error_not_support_protocol),
	
	/**
	 * 没有数据
	 */
	no_data(ErrorType.later, HttpStatus.error_no_data),
	
	/**
	 * 数据长度不对
	 */
	length_not_right(ErrorType.later, HttpStatus.error_data_length_not_right),
	
	/**
	 * 限流
	 */
	throttling(ErrorType.later, HttpStatus.error_throttling),
	
	/**
	 * 服务器错误
	 */
	server_error(ErrorType.server_error, HttpStatus.error_unknown),
	
	/**
	 * 微信服务器错误
	 */
	wechat_error(ErrorType.later, HttpStatus.error_third_service_unavailable),
	
	/**
	 * 网易云信服务器错误
	 */
	neteaseim_error(ErrorType.later, HttpStatus.error_third_service_unavailable),
	
	/**
	 * 请求的数据不存在
	 */
	not_found(ErrorType.not_found,HttpStatus.success),
	/**
	 * 没有权限
	 */
	no_privilege(ErrorType.no_privilege,HttpStatus.success),
	/**
	 * 未认证
	 */
	unauthorized(ErrorType.unauthorized,HttpStatus.success),
	/**
	 * 认证信息审核中
	 */
	reviewing(ErrorType.reviewing,HttpStatus.success),
	/**
	 * 认证信息被拒绝
	 */
	rejected(ErrorType.rejected,HttpStatus.success),
	/**
	 * 老板开除了秘书
	 */
	fired(ErrorType.fired, HttpStatus.success),
	/**
	 * 含有敏感信息
	 */
	risky_content(ErrorType.later,HttpStatus.success),

	/**
	 * product参数错误
	 */
	unknown_product(ErrorType.rejected, HttpStatus.error_unknown),

	/**
	 * 文件不存在
	 */
	file_isNot_exist(ErrorType.file_is_not_exist, HttpStatus.error_no_data);
	
	private ErrorType type;
	private HttpStatus status;
	ErrorCode(ErrorType type, HttpStatus status) {
		this.type = type;
		this.status = status;
	}
	
	public int getStatus() {
		return status.getStatus();
	}
	
	public ErrorType getType() {
		return type;
	}
}