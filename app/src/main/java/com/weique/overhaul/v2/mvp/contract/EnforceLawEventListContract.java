package com.weique.overhaul.v2.mvp.contract;

import android.content.Context;

import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;
import com.weique.overhaul.v2.mvp.model.entity.BaseBean;
import com.weique.overhaul.v2.mvp.model.entity.EventsReportedBean;
import com.weique.overhaul.v2.mvp.model.entity.GridInformationBean;

import java.util.List;

import io.reactivex.Observable;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 08/09/2020 09:42
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public interface EnforceLawEventListContract {
    interface View extends IView {

        Context getContext();

        /**
         * 设置界面列表数据
         *
         * @param newData newData
         */
        void setNewData(List<EventsReportedBean.ListBean> newData, boolean isLoadMore);


        /**
         * 获取用户网格信息
         *
         * @param pointsInJSON pointsInJSON
         */
        void getGridInfoSuccess(String pointsInJSON);

        /**
         * 获取 是否 已用户 定位 为 上报坐标点
         *
         * @param o o
         */
        void setAddressCanChanged(Boolean o);
    }

    interface Model extends IModel {

        /**
         * 获取事件上报订单列表
         *
         * @param name         name
         * @param pageSize     pageSize
         * @param ignoreNumber ignoreNumber
         * @return Observable
         */
        Observable<BaseBean<EventsReportedBean>> getEventRecord(String name, int type,
                                                                int status,
                                                                String sortType, int pageSize, int ignoreNumber);

        /**
         * 获取事件上报订单列表
         *
         * @param name         name
         * @param pageSize     pageSize
         * @param ignoreNumber ignoreNumber
         * @return Observable
         */
        Observable<BaseBean<EventsReportedBean>> getEventRecord(String name, int type,
                                                                String sortType, int pageSize, int ignoreNumber);

        Observable<BaseBean<String>> getGetNewGuidForApp();

        Observable<BaseBean<GridInformationBean>> gridOperatorInformation();

        /**
         * @return 是否允许修改坐标信息
         */
        Observable<BaseBean<Boolean>> getIsInGrid();
    }
}
