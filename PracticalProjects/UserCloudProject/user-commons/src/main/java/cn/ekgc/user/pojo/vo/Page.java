package cn.ekgc.user.pojo.vo;

import java.io.Serializable;

/**
 * @param <E>
 * @author HongDad
 * @version 4.1.0
 * @since 2.0.0
 */
public class Page<E> implements Serializable {
	private static final long serialVersionUID = -2773638322411861688L;
	private Integer pageNum;
	private Integer pageSize;
	private Integer draw;
	private Long totalCount;
	private Integer totalPage;
}
