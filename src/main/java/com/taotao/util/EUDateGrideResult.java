package com.taotao.util;

import java.util.List;

/**
 * 
 * <p>
 * Title: EUDateGrideResult
 * </p>
 * <p>
 * Description:封装返回datagrid
 * </p>
 * <p>
 * Company: www.bochy.com
 * </p>
 * 
 * @author 涛哥
 * @date 2017年4月6日上午11:00:58
 * @version 1.0
 */
public class EUDateGrideResult {
	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
