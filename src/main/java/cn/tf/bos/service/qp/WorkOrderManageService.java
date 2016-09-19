package cn.tf.bos.service.qp;

import cn.tf.bos.domain.qp.WorkOrderManage;
import cn.tf.bos.page.PageQuery;
import cn.tf.bos.page.PageResponseBean;


public interface WorkOrderManageService  extends  PageQuery{

	void saveOrUpdate(WorkOrderManage workOrderManage);

	PageResponseBean findByLucene(String conditionName,
			String conditionValue, int page, int rows);





}
