package com.yl.webservice;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.yl.model.Order;
/**
 * webservice
 * @author Administrator
 *
 */
@WebService
public interface IRemoteService {
	/**
	 * show
	 * @param message
	 * @return
	 */
	public String showRemoteMessage(@WebParam(name="message") String message);
	/**
	 * add订单
	 * @param orders
	 * @return
	 */
	public String addOrder(List<Order> orders);
}
