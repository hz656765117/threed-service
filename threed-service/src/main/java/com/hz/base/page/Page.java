package com.hz.base.page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;


/**
 * Description: 分页
 * Author: liuzh
 * Update: liuzh(2014-04-16 10:56)
 * Update: liuzh(2014-05-21 20:07)
 */
@SuppressWarnings("serial")
public class Page<E> extends ArrayList<E> {
	/**
	 * 不进行count查询
	 */
	public static final int NO_SQL_COUNT = -1;
	public static final int SQL_COUNT = 0;
	private int pageNum;
	private int pageSize;
	private int startRow;
	private int endRow;
	private long total;
	private int pages;

	public Page(int pageNum, int pageSize) {
		this(pageNum, pageSize, SQL_COUNT);
	}

	public Page(int pageNum, int pageSize, int total) {
		super(pageSize);
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.total = total;
		this.startRow = pageNum > 0 ? (pageNum - 1) * pageSize : 0;
		this.endRow = pageNum * pageSize;
	}

	public Page(RowBounds rowBounds) {
		super(rowBounds.getLimit());
		this.pageSize = rowBounds.getLimit();
		this.startRow = rowBounds.getOffset();
		//RowBounds方式默认不求count总数，如果想求count,可以修改这里为SQL_COUNT
		this.total = NO_SQL_COUNT;
		this.endRow = this.startRow + this.pageSize;
	}

	/**
	 * 通过单页 list 和分页信息，获取分页对象
	 */
	public static <E> Page<E> of(Collection<E> list, Paginator p) {
		Page<E> page = new Page<E>(p.getPage(), p.getPageSize(), p.getTotalItems());
		page.addAll(list);
		return page;
	}

	/**
	 * 得到分页器，通过Paginator可以得到总页数等值
	 *
	 * @return
	 */
	public Paginator getPaginator() {
		return Paginator.of(pageNum, pageSize, (int) total);
	}

	public List<E> getResult() {
		return this;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Map<String, Object> getPageInfo() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageNum", pageNum);
		map.put("pageSize", pageSize);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("total", total);
		map.put("pages", pages);
		return map;
	}

	@Override
	public String toString() {
		return "Page{" +
				"pageNum=" + pageNum +
				", pageSize=" + pageSize +
				", startRow=" + startRow +
				", endRow=" + endRow +
				", total=" + total +
				", pages=" + pages +
				'}';
	}
}